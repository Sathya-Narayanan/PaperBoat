package com.paperboat.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.paperboat.model.Product;
import com.paperboat.service.CategoryService;
import com.paperboat.service.ProductService;
import com.paperboat.service.SupplierService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SupplierService supplierService;
	
	public ProductController()
	{
		System.out.println("Creating instance for ProductController");
	}
	
	@RequestMapping("/Productform")
	public ModelAndView gotoProduct(Model model,@ModelAttribute("prdfrm")Product prdfrm) 
	{
		  model.addAttribute("categories",categoryService.getCategories());
		  model.addAttribute("suppliers",supplierService.getSuppliers());
		return new ModelAndView("Productform");
	}
	
	@RequestMapping("/addProducts")
	public String addProducts()
	{
		return "addProducts";
	}
	
	
	@RequestMapping(value = "saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("prdfrm")Product prdfrm)
	{
		
		productService.insertRow(prdfrm);
		List<Product> ls=productService.getList();
		MultipartFile prodImage=prdfrm.getImage();
		if(!prodImage.isEmpty()){
			Path paths=
	Paths.get("C:/Users/Sathya/git/PaperBoat/Paperboat/src/main/webapp/resource/Images/"+ prdfrm.getProductid()+".jpg");
		try {
			prodImage.transferTo(new File(paths.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return new ModelAndView("listProduct","productList",ls);
	}
	
	@RequestMapping("/listProduct")
	public ModelAndView listallProducts()
	{
		List<Product> ls=productService.getList();
		return new ModelAndView("listProduct","productList",ls);
	}
	
	@RequestMapping("deleteProduct")
	public ModelAndView deleteproduct(@RequestParam int id)
	{
		
		productService.deleteRow(id);
		return new ModelAndView("redirect:listProduct");
	}
	
	@RequestMapping("/editProduct")
	public ModelAndView editproduct(@ModelAttribute("prdfrm")Product prdfrm,@RequestParam int id)
	{
		prdfrm=productService.getRowById(id);
		ModelAndView mv=new ModelAndView("editProduct","prod",prdfrm);
		return mv;
		
	}
	
	
	@RequestMapping(value="updateProduct",method=RequestMethod.POST)
	public ModelAndView updateproduct(@ModelAttribute("prdfrm")Product prdfrm)
	{
		productService.updateRow(prdfrm);
		return new ModelAndView("redirect:listProducts");
		
	}
	
	@RequestMapping("/ProductsByCategory")
	public String getProductsByCategory(@RequestParam(name="searchCondition") String searchCondition,
			Model model){
		List<Product> products=productService.getList();
		//Assigning list of products to model attribute products
		model.addAttribute("listProduct",products);
		model.addAttribute("searchCondition",searchCondition);
		return "listProduct";
	}
	
}

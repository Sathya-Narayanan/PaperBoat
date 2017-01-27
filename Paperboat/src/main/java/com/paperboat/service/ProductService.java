package com.paperboat.service;
import java.util.List;

import com.paperboat.model.Product;

public interface ProductService 
{

	public int insertRow(Product prd);

	public List<Product> getList();

	 public Product getRowById(int id);

	 public int updateRow(Product prd);

	 public int deleteRow(int id);

}

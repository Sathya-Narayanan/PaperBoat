package com.paperboat.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperboat.dao.CategoryDao;
import com.paperboat.model.Category;





@Service("categoryService")
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryDao categoryDao;

	
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getCategories();
	}
	
}

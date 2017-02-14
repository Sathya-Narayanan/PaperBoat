package com.paperboat.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paperboat.Dao.CategoryDao;
import com.paperboat.model.Category;


	@Service("categoryService")
	public class CategoryServiceImpl implements CategoryService
	{
		@Autowired
		private CategoryDao categoryDao;

		
		public List<Category> getCategories() {
			
			return categoryDao.getCategories();
		}
		
	}

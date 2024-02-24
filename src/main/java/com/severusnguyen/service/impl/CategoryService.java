package com.severusnguyen.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.severusnguyen.dao.ICategoryDAO;
import com.severusnguyen.model.CategoryModel;
import com.severusnguyen.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}

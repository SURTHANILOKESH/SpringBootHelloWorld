package com.reg.baseapp.serviceDAO;

import java.util.List;

import com.reg.baseapp.entity.CategoryEntity;

public interface ICategoryServiceDAO {
	
	public CategoryEntity addCategory(CategoryEntity catgent);
	
	public List<CategoryEntity> getAllCategories();
	
	public CategoryEntity getById(int id);
	
	public List<CategoryEntity> getByFKid(int id);
	
}
package com.reg.baseapp.DAO;

import java.util.List;

import com.reg.baseapp.entity.CategoryEntity;

public interface ICategoryDAO {
	
	public CategoryEntity addCategory(CategoryEntity catgent);
	
	public List<CategoryEntity> getAllCategories();
	
	public CategoryEntity getById(int id);
	
	public List<CategoryEntity> getByFKid(int id);

}

package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.ICategoryDAO;
import com.reg.baseapp.entity.CategoryEntity;

@Service
public class CategoryServiceDAOImpl implements ICategoryServiceDAO {
	
	@Autowired
	ICategoryDAO iCategoryDAO;
	
	public CategoryEntity addCategory(CategoryEntity catgent) {
		return iCategoryDAO.addCategory(catgent);
	}

	public List<CategoryEntity> getAllCategories() {
		return iCategoryDAO.getAllCategories();
	}


	public CategoryEntity getById(int id) {
		return iCategoryDAO.getById(id);
	}

	public List<CategoryEntity> getByFKid(int id) {
		return iCategoryDAO.getByFKid(id);
	}

}

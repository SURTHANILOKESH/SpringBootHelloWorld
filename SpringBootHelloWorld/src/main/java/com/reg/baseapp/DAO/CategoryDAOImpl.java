package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.CategoryEntity;
import com.reg.baseapp.repository.BaseRepository;

@Service
public class CategoryDAOImpl implements ICategoryDAO {
	
	@Autowired
	BaseRepository baseRepository;
	
	public CategoryEntity addCategory(CategoryEntity catgent) {
		return baseRepository.save(catgent);
	}
	
	public List<CategoryEntity> getAllCategories() {
		return baseRepository.findAll();
	}

	public CategoryEntity getById(int id) {
		return baseRepository.getOne(id);
	}

	public List<CategoryEntity> getByFKid(int id) {
		return baseRepository.getByFKid(id);
	}
}

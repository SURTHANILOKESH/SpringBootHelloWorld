package com.reg.baseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reg.baseapp.entity.CategoryEntity;
import com.reg.baseapp.serviceDAO.ICategoryServiceDAO;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	 
	@Autowired
	ICategoryServiceDAO iCategoryServiceDAO;
	
	@PostMapping("/post")
	public CategoryEntity postCategory(@RequestBody CategoryEntity centity) {
		return iCategoryServiceDAO.addCategory(centity);
	}
	
	@GetMapping("/getall")
	public List<CategoryEntity> getallCategory() {
		return iCategoryServiceDAO.getAllCategories();
	}
	
	@GetMapping("/getby/{id}")
	@ResponseBody
	public ResponseEntity<CategoryEntity> getById(@PathVariable("id") int id){
		
		CategoryEntity cat = iCategoryServiceDAO.getById(id);
		return ResponseEntity.ok().body(cat);
	}
	
	@GetMapping("/getbycatalog/{id}")
	public List<CategoryEntity> gettest(@PathVariable("id") int id) {
		return iCategoryServiceDAO.getByFKid(id);
	}
	
}

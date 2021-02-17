package com.reg.baseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.baseapp.entity.ProductDetailsEntity;
import com.reg.baseapp.serviceDAO.IProductDetailsServiceDAO;

@RestController
@RequestMapping("/productdetails")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductDetailsController {
	
	@Autowired
	IProductDetailsServiceDAO iProductDetailsServiceDAO;
	
	@GetMapping("/getall")
	public List<ProductDetailsEntity> getAllProductsDetails(){
		return iProductDetailsServiceDAO.getAll();
	}
	
	@GetMapping("/by/{id}")
	public List<ProductDetailsEntity> getById(@PathVariable("id") int id){
		return iProductDetailsServiceDAO.getByFkId(id);
	}
}

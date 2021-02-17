package com.reg.baseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.baseapp.entity.CatalogEntity;
import com.reg.baseapp.serviceDAO.ICatalogServiceDAO;

@RestController
@RequestMapping("/catalog")
@CrossOrigin(origins = "http://localhost:4200")
public class CatalogController {
	
	@Autowired
	ICatalogServiceDAO iCatalogServiceDAO;
	
	@PostMapping("/postcatalog")
	public CatalogEntity postCatalog(CatalogEntity catalog) {
		return iCatalogServiceDAO.addCatalog(catalog);
	}
	
	@GetMapping("/getallcatalogs")
	public List<CatalogEntity> getAllCatalogs(){
		return iCatalogServiceDAO.getAllCatalogs();
	}
	
}

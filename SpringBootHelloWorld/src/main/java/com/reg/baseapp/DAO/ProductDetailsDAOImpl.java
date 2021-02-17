package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.ProductDetailsEntity;
import com.reg.baseapp.repository.ProductDetailsRepository;

@Service
public class ProductDetailsDAOImpl implements IProductDetailsDAO {
	
	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	public List<ProductDetailsEntity> getAll() {
		return productDetailsRepository.findAll();
	}

	public List<ProductDetailsEntity> getByFkId(int id) {
		return productDetailsRepository.getByFKid(id);
	}

}

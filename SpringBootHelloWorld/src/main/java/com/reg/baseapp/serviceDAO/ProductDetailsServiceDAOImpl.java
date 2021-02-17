package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.IProductDetailsDAO;
import com.reg.baseapp.entity.ProductDetailsEntity;

@Service
public class ProductDetailsServiceDAOImpl implements IProductDetailsServiceDAO {

	@Autowired
	IProductDetailsDAO iProductDetailsDAO;
	
	public List<ProductDetailsEntity> getAll() {
		return iProductDetailsDAO.getAll();
	}

	public List<ProductDetailsEntity> getByFkId(int id) {
		return iProductDetailsDAO.getByFkId(id);
	}

}

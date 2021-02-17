package com.reg.baseapp.serviceDAO;

import java.util.List;

import com.reg.baseapp.entity.ProductDetailsEntity;

public interface IProductDetailsServiceDAO {
	
	public List<ProductDetailsEntity> getAll();
	
	public List<ProductDetailsEntity> getByFkId(int id);

}

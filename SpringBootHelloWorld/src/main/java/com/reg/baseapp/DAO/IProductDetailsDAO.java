package com.reg.baseapp.DAO;

import java.util.List;

import com.reg.baseapp.entity.ProductDetailsEntity;

public interface IProductDetailsDAO {
	
	public List<ProductDetailsEntity> getAll();
	
	public List<ProductDetailsEntity> getByFkId(int id);

}

package com.reg.baseapp.serviceDAO;

import java.util.List;

import com.reg.baseapp.entity.CatalogEntity;

public interface ICatalogServiceDAO {

	public CatalogEntity addCatalog(CatalogEntity catalogEntity);

	public List<CatalogEntity> getAllCatalogs();

}
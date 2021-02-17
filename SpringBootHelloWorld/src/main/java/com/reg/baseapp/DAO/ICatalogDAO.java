package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.CatalogEntity;

@Service
public interface ICatalogDAO {
	
	public CatalogEntity addCatalog(CatalogEntity catalogEntity);
	
	public List<CatalogEntity> getallCatalogs();
}

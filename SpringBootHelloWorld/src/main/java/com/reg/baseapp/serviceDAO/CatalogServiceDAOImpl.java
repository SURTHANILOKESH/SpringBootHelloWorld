package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.ICatalogDAO;
import com.reg.baseapp.entity.CatalogEntity;

@Service
public class CatalogServiceDAOImpl implements ICatalogServiceDAO{

	@Autowired
	ICatalogDAO iCatalogDAO;
	public CatalogEntity addCatalog(CatalogEntity catalogEntity) {
		
		return iCatalogDAO.addCatalog(catalogEntity);
	}

	public List<CatalogEntity> getAllCatalogs() {
		
		return iCatalogDAO.getallCatalogs();
	}

}
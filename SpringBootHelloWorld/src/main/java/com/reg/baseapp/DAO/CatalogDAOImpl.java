package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.CatalogEntity;
import com.reg.baseapp.repository.CatalogRepositiry;

@Service
public class CatalogDAOImpl implements ICatalogDAO {
	
	@Autowired
	CatalogRepositiry catalogRepositiry;
	
	public CatalogEntity addCatalog(CatalogEntity catalogEntity) {
		
		return catalogRepositiry.save(catalogEntity);
	}
	
	public List<CatalogEntity> getallCatalogs() {
	
		return catalogRepositiry.findAll();
	}
}
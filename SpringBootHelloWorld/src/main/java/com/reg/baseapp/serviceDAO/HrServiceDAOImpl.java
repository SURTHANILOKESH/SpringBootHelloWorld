package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.IHrDAO;
import com.reg.baseapp.entity.HrEntity;

@Service
public class HrServiceDAOImpl implements IHrServiceDAO {
	
	@Autowired
	IHrDAO iHrDAO;

	public List<HrEntity> getall() {		
		return iHrDAO.getall();
	}
	
	

}

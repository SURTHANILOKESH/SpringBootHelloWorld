package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.IEmployeeDAO;
import com.reg.baseapp.entity.EmployeeEntity;

@Service
public class EmployeeServiceDAOImpl implements IEmloyeeServiceDAO {
	
	@Autowired
	IEmployeeDAO iEmployeeDAO;
	public EmployeeEntity addEmployee(EmployeeEntity empent) {
		return iEmployeeDAO.addEmployee(empent);
	}

	public List<EmployeeEntity> getAllEmployees() {
		return iEmployeeDAO.getAllEmployees();
	}

}

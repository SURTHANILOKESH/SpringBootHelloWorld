package com.reg.baseapp.serviceDAO;

import java.util.List;

import com.reg.baseapp.entity.EmployeeEntity;

public interface IEmloyeeServiceDAO {
	
	public EmployeeEntity addEmployee(EmployeeEntity empent);
	
	public List<EmployeeEntity> getAllEmployees();
	
}

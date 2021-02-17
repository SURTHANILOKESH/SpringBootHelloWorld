package com.reg.baseapp.DAO;

import java.util.List;

import com.reg.baseapp.entity.EmployeeEntity;

public interface IEmployeeDAO {
	
	public EmployeeEntity addEmployee(EmployeeEntity empent);
	
	public List<EmployeeEntity> getAllEmployees();
	
}

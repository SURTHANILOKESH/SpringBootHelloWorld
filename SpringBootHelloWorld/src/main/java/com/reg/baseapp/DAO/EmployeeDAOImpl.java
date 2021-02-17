package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.EmployeeEntity;
import com.reg.baseapp.repository.EmployeeRepository;

@Service
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeEntity addEmployee(EmployeeEntity empent) {		
		return employeeRepository.save(empent);
	}

	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepository.findAll();
	}

}

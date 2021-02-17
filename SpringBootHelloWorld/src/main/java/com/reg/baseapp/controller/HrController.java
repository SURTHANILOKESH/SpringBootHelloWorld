package com.reg.baseapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.baseapp.entity.EmployeeEntity;
import com.reg.baseapp.entity.HrEntity;
import com.reg.baseapp.service.HRLogin;
import com.reg.baseapp.serviceDAO.IEmloyeeServiceDAO;


@RestController
@RequestMapping("/hr")
@CrossOrigin(origins = "http://localhost:4200")
public class HrController {
	
	@Autowired
	HRLogin hRLogin;
	
	@Autowired
	IEmloyeeServiceDAO iEmloyeeServiceDAO;
	
	@PostMapping("/login")
	public boolean HrLogin(@RequestBody HrEntity hr) {
		if(hRLogin.HrLogin(hr)) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<EmployeeEntity> addEmployee(@RequestHeader(value="Authorization")String credits, @RequestBody EmployeeEntity empent) {
		HrEntity hr = hRLogin.decodeHR(credits);
		if(hRLogin.HrLogin(hr)) {
		EmployeeEntity empenti = iEmloyeeServiceDAO.addEmployee(empent);
		return ResponseEntity.ok().body(empenti);		
		}
		return ResponseEntity.notFound().build();
	}
	
}

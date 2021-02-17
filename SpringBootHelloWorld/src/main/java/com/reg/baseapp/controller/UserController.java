package com.reg.baseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.baseapp.dto.UserLoginBean;
import com.reg.baseapp.entity.UsersEntity;
import com.reg.baseapp.service.UserLogin;
import com.reg.baseapp.serviceDAO.UserserviceDAOImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserserviceDAOImpl userserviceDAOImpl;
	
	@GetMapping("/getall")
	public List<UsersEntity> getAllUsers(){
		return userserviceDAOImpl.getAll();
	}
	
	@PostMapping("/add")
	public UsersEntity userSignup(@RequestBody UsersEntity usersEntity) {
		return userserviceDAOImpl.AddUsers(usersEntity);
	}
	
	@Autowired
	UserLogin userLogin;
	
	@PostMapping("/login")
	public boolean userLogin(@RequestBody UserLoginBean user) {
		if(userLogin.userLoginCheck(user)) {
			return true;
		}
		return false;		
	}

}

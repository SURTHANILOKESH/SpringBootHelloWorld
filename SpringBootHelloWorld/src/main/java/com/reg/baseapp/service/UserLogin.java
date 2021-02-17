package com.reg.baseapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.dto.UserLoginBean;
import com.reg.baseapp.entity.UsersEntity;
import com.reg.baseapp.serviceDAO.UserserviceDAOImpl;

@Service
public class UserLogin {

	@Autowired
	UserserviceDAOImpl userserviceDAOImpl;

	public boolean userLoginCheck(UserLoginBean user) {
		List<UsersEntity> ulist = userserviceDAOImpl.getAll();
		for (UsersEntity users : ulist) {
			if (((users.getEmail().equals(user.getUname())) || (users.getMobileno().equals(user.getUname())))
					&& (users.getPswd().equals(user.getPswd()))) {
				return true;
			}
		}
		return false;

	}
}

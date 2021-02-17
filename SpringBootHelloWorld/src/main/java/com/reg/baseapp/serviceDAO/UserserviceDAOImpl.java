package com.reg.baseapp.serviceDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.DAO.IUsersDAO;
import com.reg.baseapp.entity.UsersEntity;

@Service
public class UserserviceDAOImpl implements IUserServiceDAO {

	@Autowired
	IUsersDAO iUsersDAO;
	
	public List<UsersEntity> getAll() {
		return iUsersDAO.getAll();
	}

	public UsersEntity AddUsers(UsersEntity usersEntity) {
		return iUsersDAO.addUsers(usersEntity);
	}

}

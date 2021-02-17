package com.reg.baseapp.serviceDAO;

import java.util.List;

import com.reg.baseapp.entity.UsersEntity;

public interface IUserServiceDAO {
	
	public List<UsersEntity> getAll();
	
	public UsersEntity AddUsers(UsersEntity usersEntity);

}

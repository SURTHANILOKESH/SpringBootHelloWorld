package com.reg.baseapp.DAO;

import java.util.List;

import com.reg.baseapp.entity.UsersEntity;

public interface IUsersDAO {
	
	public List<UsersEntity> getAll();
	
	public UsersEntity addUsers(UsersEntity userentity);

}

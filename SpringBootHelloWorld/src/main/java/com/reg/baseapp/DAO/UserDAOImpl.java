package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.UsersEntity;
import com.reg.baseapp.repository.UserRepository;

@Service
public class UserDAOImpl implements IUsersDAO {

	@Autowired
	UserRepository userRepository;
	public List<UsersEntity> getAll() {
		return userRepository.findAll();
	}

	public UsersEntity addUsers(UsersEntity usersEntity) {
		return userRepository.save(usersEntity);
	}

}

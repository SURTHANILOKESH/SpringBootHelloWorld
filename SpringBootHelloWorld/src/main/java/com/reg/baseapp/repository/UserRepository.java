package com.reg.baseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.baseapp.entity.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Integer> {

}

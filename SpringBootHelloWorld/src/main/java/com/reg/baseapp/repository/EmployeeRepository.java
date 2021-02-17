package com.reg.baseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.baseapp.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}

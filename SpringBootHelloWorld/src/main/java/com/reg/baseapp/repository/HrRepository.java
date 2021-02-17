package com.reg.baseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.baseapp.entity.HrEntity;

public interface HrRepository extends JpaRepository<HrEntity, Integer> {
}

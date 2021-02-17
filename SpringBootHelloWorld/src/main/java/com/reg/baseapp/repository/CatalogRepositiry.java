package com.reg.baseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.baseapp.entity.CatalogEntity;

public interface CatalogRepositiry extends JpaRepository<CatalogEntity, Integer> {

}

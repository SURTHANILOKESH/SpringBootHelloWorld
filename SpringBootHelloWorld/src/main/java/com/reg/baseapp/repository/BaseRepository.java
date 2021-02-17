package com.reg.baseapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reg.baseapp.entity.CategoryEntity;

public interface BaseRepository extends JpaRepository<CategoryEntity, Integer> {
	
	@Query(value="SELECT * from mobile_cart.category_tbl where catalog_entity_id=?1", nativeQuery = true)
	public List<CategoryEntity> getByFKid(int id);
	
}

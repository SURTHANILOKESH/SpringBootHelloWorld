package com.reg.baseapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reg.baseapp.entity.ProductDetailsEntity;

public interface ProductDetailsRepository extends JpaRepository<ProductDetailsEntity, Integer> {
	@Query(value="SELECT * from mobile_cart.productdetail_tbl where category_entity_id=?1", nativeQuery = true)
	public List<ProductDetailsEntity> getByFKid(int id);
	
}

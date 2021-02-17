package com.reg.baseapp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.baseapp.entity.HrEntity;
import com.reg.baseapp.repository.HrRepository;

@Service
public class HrDAOImpl implements IHrDAO {

	@Autowired
	HrRepository hrRepository;

	public List<HrEntity> getall() {		
		return hrRepository.findAll();
	}
}

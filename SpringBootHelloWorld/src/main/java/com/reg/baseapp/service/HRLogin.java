package com.reg.baseapp.service;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.reg.baseapp.entity.HrEntity;
import com.reg.baseapp.serviceDAO.IHrServiceDAO;

@Service
public class HRLogin {
	
	@Autowired
	IHrServiceDAO iHrServiceDAO;
	
	public boolean HrLogin(HrEntity hr) {
		List<HrEntity> hrlist = iHrServiceDAO.getall();
		for (HrEntity hrEntity : hrlist) {
			if((hrEntity.getUname().equals(hr.getUname())) && (hrEntity.getPswd().equals(hr.getPswd()))) {
				return true;
			}
		}
		return false;
	}
	
	public HrEntity decodeHR(String headers) {
		String[] seg = headers.split(" ");
		String cred = seg[1];
		byte[] decodebyte = Base64.decodeBase64(cred.getBytes());
		String decodecreds = new String(decodebyte);
		String[] decode = decodecreds.split(":");
		String uid = decode[0];
		String upswd = decode[1];
		HrEntity hr = new HrEntity(uid, upswd);
		return hr;
		
	}

}

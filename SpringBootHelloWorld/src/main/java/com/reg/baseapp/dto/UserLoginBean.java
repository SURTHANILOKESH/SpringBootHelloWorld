package com.reg.baseapp.dto;

import org.springframework.stereotype.Service;

@Service
public class UserLoginBean {
	
	private String uname;
	
	private String pswd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

}

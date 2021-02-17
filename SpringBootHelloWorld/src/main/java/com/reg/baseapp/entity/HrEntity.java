package com.reg.baseapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@Entity
@Table(name="Hr_tbl", schema="mobile_cart")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HrEntity {
	
	public HrEntity() {}
	
	public HrEntity(String uname, String pswd) {
		this.uname = uname;
		this.pswd = pswd;
	}

	@Id
	@GeneratedValue
	private int id;
	
	private String uname;
	
	private String pswd;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

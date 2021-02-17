package com.reg.baseapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "User_tbl", schema = "mobile_cart")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UsersEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String fname;
	
	private String sname;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String mobileno;
	
	private String Gender;
	
	private String pswd;
	
	private String confirmpswd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getConfirmpswd() {
		return confirmpswd;
	}

	public void setConfirmpswd(String confirmpswd) {
		this.confirmpswd = confirmpswd;
	}

}

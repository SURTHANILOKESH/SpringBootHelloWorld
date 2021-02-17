package com.reg.baseapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "category_tbl", schema = "mobile_cart")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoryEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String cname;
	
	private String descr;
	
	private String color;
	
	private String ram_rom;
	
	private String imgpath;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CatalogEntity catalogEntity;
	
	public CategoryEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam_rom() {
		return ram_rom;
	}

	public void setRam_rom(String ram_rom) {
		this.ram_rom = ram_rom;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

	public CatalogEntity getCatalogEntity() {
		return catalogEntity;
	}
	
	public void setCatalogEntity(CatalogEntity catalogEntity) {
		this.catalogEntity = catalogEntity;
	}
	
	}

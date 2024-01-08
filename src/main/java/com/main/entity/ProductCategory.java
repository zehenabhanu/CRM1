package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product Category")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int pcid;
  private String pcname;
  private String description;
public ProductCategory() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductCategory(String pcname, String description) {
	super();
	this.pcname = pcname;
	this.description = description;
}
public String getPcname() {
	return pcname;
}
public void setPcname(String pcname) {
	this.pcname = pcname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}


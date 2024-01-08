package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product Details")
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private int pcode;
 private String pdname;
 private String details;
 private String pcategory;
 private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPcode() {
	return pcode;
}
public void setPcode(int pcode) {
	this.pcode = pcode;
}
public String getPdname() {
	return pdname;
}
public void setPdname(String pdname) {
	this.pdname = pdname;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getPcategory() {
	return pcategory;
}
public void setPcategory(String pcategory) {
	this.pcategory = pcategory;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public ProductDetails(int id, int pcode, String pdname, String details, String pcategory, double price) {
	super();
	this.id = id;
	this.pcode = pcode;
	this.pdname = pdname;
	this.details = details;
	this.pcategory = pcategory;
	this.price = price;
}
public ProductDetails() {
	super();
	// TODO Auto-generated constructor stub
}
 
}

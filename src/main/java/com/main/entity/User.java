package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String mbl;
  private String email;
  private String address;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String mbl, String email, String address) {
	super();
	this.id = id;
	this.name = name;
	this.mbl = mbl;
	this.email = email;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMbl() {
	return mbl;
}
public void setMbl(String mbl) {
	this.mbl = mbl;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin login")
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String admin;
  private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAdmin() {
	return admin;
}
public void setAdmin(String admin) {
	this.admin = admin;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public AdminLogin(int id, String admin, String password) {
	super();
	this.id = id;
	this.admin = admin;
	this.password = password;
}
public AdminLogin() {
	super();
	// TODO Auto-generated constructor stub
}
  
}

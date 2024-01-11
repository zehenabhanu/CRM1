package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp login")
public class EmpLogin {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empname;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmpLogin(int id, String empname, String password) {
		super();
		this.id = id;
		this.empname = empname;
		this.password = password;
	}
	public EmpLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

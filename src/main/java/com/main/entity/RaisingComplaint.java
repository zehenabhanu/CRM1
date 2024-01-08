package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="complaints")
public class RaisingComplaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String pname;
	private String subject;
	private String complaint;
		
	public RaisingComplaint(int id, String pname, String subject, String complaint) {
		super();
		this.id = id;
		this.pname = pname;
		this.subject = subject;
		this.complaint = complaint;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	
	public RaisingComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}
 
}

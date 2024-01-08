package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FAQ")
public class FAQ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String question;
 private String answer;
public FAQ() {
	super();
	// TODO Auto-generated constructor stub
}

public FAQ(int id, String question, String answer) {
	super();
	this.id = id;
	this.question = question;
	this.answer = answer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
}

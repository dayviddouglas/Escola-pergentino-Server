package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name = "formacao", nullable = false, length=25)
	private String formacao;
  
  public Professor() {
	// TODO Auto-generated constructor stub
}
  
public Professor(Long id, String formacao) {
	super();
	this.id = id;
	this.formacao = formacao;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFormacao() {
	return formacao;
}

public void setFormacao(String formacao) {
	this.formacao = formacao;
}

@Override
public String toString() {
	return "Professor [id=" + id + ", formacao=" + formacao + "]";
}




  
  
}

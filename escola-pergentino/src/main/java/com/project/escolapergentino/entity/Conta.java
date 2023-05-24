package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @Column(name = "login", nullable = false, length = 20)
  private String login;
  @Column(name = "senha", nullable = false, length = 20)
  private String senha;
  
  public Conta() {
	// TODO Auto-generated constructor stub
}
  

public Conta(Long id, String login, String senha) {
	super();
	this.id = id;
	this.login = login;
	this.senha = senha;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}


@Override
public String toString() {
	return "Conta [id=" + id + ", login=" + login + ", senha=" + senha + "]";
}
  
  
}

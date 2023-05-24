package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "responsavel")
public class Responsavel{
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nome", nullable = false, length=60)
  private String nome;
  @Column(name = "cpf", nullable = false, unique = true,length =14)
  private String cpf;
  @Column(name = "email", nullable = false, length=150)
  private String email;
  @Column(name = "telefone", nullable = false, length=15)
  private String telefone;
  @Embedded
  private Endereco endereco;
  
  public Responsavel() {
	// TODO Auto-generated constructor stub
}

public Responsavel(Long id, String nome, String cpf, String email, String telefone) {
	super();
	this.id = id;
	this.nome = nome;
	this.cpf = cpf;
	this.email = email;
	this.telefone = telefone;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

@Override
public String toString() {
	return "Responsavel [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone
			+ "]";
}
  
  
}

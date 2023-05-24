package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "turma")
public class Turma {
	
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)	
  private Long id;
  @Column(name = "descricao", nullable = false, length=10)
  private String descricao;
  @Column(name = "turno", nullable = false, length=5)
  private String turno;
  
  public Turma() {
	// TODO Auto-generated constructor stub
}
  
  

public Turma(Long id, String descricao, String turno) {
	super();
	this.id = id;
	this.descricao = descricao;
	this.turno = turno;
}



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getTurno() {
	return turno;
}

public void setTurno(String turno) {
	this.turno = turno;
}



@Override
public String toString() {
	return "Turma [id=" + id + ", descricao=" + descricao + ", turno=" + turno + "]";
}
  
  
  
  
}

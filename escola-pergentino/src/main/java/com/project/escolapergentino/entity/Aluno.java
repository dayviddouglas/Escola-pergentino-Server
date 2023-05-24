package com.project.escolapergentino.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)	
	private Long id;
	@Column(name = "nome", nullable = false, length=60)
	private String nome;
	@DateTimeFormat(pattern ="dd-MM-yyyy")
	@Column(name = "data_nascimento", nullable = false)
	private Date data_nascimento;
	@Column(name = "falta", nullable = true)
	private int falta;
	@Column(name = "nota", nullable = true, columnDefinition = "FLOAT(4,2)")
	private float nota;
	@Column(name = "alergia", nullable = false)
	private String alergia;
	@Column(name = "fator_rh", nullable = false, length = 3)
	private String fator_rh;
 
 public Aluno() {
	// TODO Auto-generated constructor stub
}

public Aluno(Long id, String nome, Date data_nascimento, int falta, float nota, String alergia, String fator_rh) {
	super();
	this.id = id;
	this.nome = nome;
	this.data_nascimento = data_nascimento;
	this.falta = falta;
	this.nota = nota;
	this.alergia = alergia;
	this.fator_rh = fator_rh;
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

public Date getData_nascimento() {
	return data_nascimento;
}

public void setData_nascimento(Date data_nascimento) {
	this.data_nascimento = data_nascimento;
}

public int getFalta() {
	return falta;
}

public void setFalta(int falta) {
	this.falta = falta;
}

public float getNota() {
	return nota;
}

public void setNota(float nota) {
	this.nota = nota;
}

public String getAlergia() {
	return alergia;
}

public void setAlergia(String alergia) {
	this.alergia = alergia;
}

public String getFator_rh() {
	return fator_rh;
}

public void setFator_rh(String fator_rh) {
	this.fator_rh = fator_rh;
}

@Override
public String toString() {
	return "Aluno [id=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", falta=" + falta
			+ ", nota=" + nota + ", alergia=" + alergia + ", fator_rh=" + fator_rh + "]";
}
 
 
}

package com.project.escolapergentino.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "nome", nullable = false, length=60)
  private String nome;
  
  @Column(name = "cpf", nullable = false, unique = true,length =14)
  private String cpf;
  
  @DateTimeFormat(pattern ="dd-MM-yyyy")
  @Column(name = "data_nascimento", nullable = false)
  private Date data_nascimento;
  
  @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @Column(name = "data_admissao", nullable = false)
  private LocalDateTime data_admissao;
  
  @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @Column(name = "data_demissao", nullable = true)
  private LocalDateTime data_demissao;
  
  
  @Column(name = "diretor_id", nullable = true)
  private Long diretorId;
  
  @OneToOne(optional = true)
  @JoinColumn(name = "diretor_id", nullable = false, insertable = false, updatable = false)
  private Diretor diretor;
  
  
  
public Funcionario() {
	// TODO Auto-generated constructor stub
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


public Date getData_nascimento() {
	return data_nascimento;
}


public void setData_nascimento(Date data_nascimento) {
	this.data_nascimento = data_nascimento;
}


public LocalDateTime getData_admissao() {
	return data_admissao;
}


public void setData_admissao(LocalDateTime data_admissao) {
	this.data_admissao = data_admissao;
}


public LocalDateTime getData_demissao() {
	return data_demissao;
}


public void setData_demissao(LocalDateTime data_demissao) {
	this.data_demissao = data_demissao;
}


@Override
public String toString() {
	return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", data_nascimento=" + data_nascimento
			+ ", data_admissao=" + data_admissao + ", data_demissao=" + data_demissao + "]";
}
 
 
 
 



 
 
}

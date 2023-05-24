package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "contato")
public class Contato {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", nullable = false, length=60)
	private String nome;
	@Column(name = "email", nullable = false, length=150)
	private String email;
	@Column(name = "telefone", nullable = false, length = 15)
	private String telefone;
	@Column(name = "motivo", nullable = false, length=20)
	private String motivo;
	@Column(name = "observacao", nullable = false,columnDefinition = "TEXT")
	private String observacao;
 
 public Contato() {
	// TODO Auto-generated constructor stub
}

public Contato(Long id, String nome, String email, String telefone, String motivo, String observacao) {
	super();
	this.id = id;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.motivo = motivo;
	this.observacao = observacao;
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

public String getMotivo() {
	return motivo;
}

public void setMotivo(String motivo) {
	this.motivo = motivo;
}

public String getObservacao() {
	return observacao;
}

public void setObservacao(String observacao) {
	this.observacao = observacao;
}

@Override
public String toString() {
	return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", motivo=" + motivo
			+ ", observacao=" + observacao + "]";
}


 
 
 

}

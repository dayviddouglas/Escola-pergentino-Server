package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class Endereco {
  @Column(name = "cidade", nullable = false, length=25)
  private String cidade;
  @Column(name = "rua", nullable = false, length=100)
  private String rua;
  @Column(name = "bairro", nullable = false, length=25)
  private String bairro;
  @Column(name = "cep", nullable = false, length=10)
  private String cep;
  @Column(name = "uf", nullable = false, length=2)
  private String uf;
  @Column(name = "numero", nullable = false, length=6)
  private String numero;
  @Column(name = "complemento", nullable = true, length=80)
  private String complemento;
   
  public Endereco() {
	// TODO Auto-generated constructor stub
}

public Endereco(String cidade, String rua, String bairro, String cep, String uf, String numero, String complemento) {
	super();
	this.cidade = cidade;
	this.rua = rua;
	this.bairro = bairro;
	this.cep = cep;
	this.uf = uf;
	this.numero = numero;
	this.complemento = complemento;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getRua() {
	return rua;
}

public void setRua(String rua) {
	this.rua = rua;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getCep() {
	return cep;
}

public void setCep(String cep) {
	this.cep = cep;
}

public String getUf() {
	return uf;
}

public void setUf(String uf) {
	this.uf = uf;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

@Override
public String toString() {
	return "Endereco [cidade=" + cidade + ", rua=" + rua + ", bairro=" + bairro + ", cep=" + cep + ", uf=" + uf
			+ ", numero=" + numero + ", complemento=" + complemento + "]";
}
  

  
  
}

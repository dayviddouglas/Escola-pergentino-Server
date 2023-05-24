package com.project.escolapergentino.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table (name = "documentacao")
public class Documentacao {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  
  @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @Column(name = "data_envio", nullable = false)
  private LocalDateTime data_envio;
  
  @Lob
  @Column(columnDefinition = "MEDIUMBLOB", name = "tranferencia", nullable = true)
  private byte[] transferencia;
  
  @Lob
  @Column(columnDefinition = "MEDIUMBLOB",name = "registro_nascimento_aluno", nullable = false)
  private byte[] resgistro_nascimento_aluno;
  
  @Lob
  @Column(columnDefinition = "BLOB",name = "identidade_frente_responsavel" , nullable = false)
  private byte[] identidade_frente_responsavel;
  
  @Lob
  @Column(columnDefinition = "BLOB",name = "identidade_verso_responsavel" , nullable = false)
  private byte[] identidade_verso_responsavel;
  
  @Lob
  @Column(columnDefinition = "BLOB",name = "comprovante_residencia" , nullable = false)
  private byte[] comprovante_residencia;
  
  @Lob
  @Column(columnDefinition = "MEDIUMBLOB",name = "fator_rh" , nullable = false)
  private byte[] fator_rh;
  
  @Lob
  @Column(columnDefinition = "BLOB",name = "nada_consta" , nullable = false)
  private byte[] nada_consta;
  
  public Documentacao() {
	// TODO Auto-generated constructor stub
}

public Documentacao(Long id, LocalDateTime data_envio, byte[] transferecia, byte[] resgistro_nascimento_aluno,
		byte[] identidade_frente_responsavel, byte[] identidade_verso_responsavel, byte[] comprovante_residencia,
		byte[] fator_rh, byte[] nada_consta) {
	super();
	this.id = id;
	this.data_envio = data_envio;
	this.transferencia = transferecia;
	this.resgistro_nascimento_aluno = resgistro_nascimento_aluno;
	this.identidade_frente_responsavel = identidade_frente_responsavel;
	this.identidade_verso_responsavel = identidade_verso_responsavel;
	this.comprovante_residencia = comprovante_residencia;
	this.fator_rh = fator_rh;
	this.nada_consta = nada_consta;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public LocalDateTime getData_envio() {
	return data_envio;
}

public void setData_envio(LocalDateTime data_envio) {
	this.data_envio = data_envio;
}

public byte[] getTransferecia() {
	return transferencia;
}

public void setTransferecia(byte[] transferecia) {
	this.transferencia = transferecia;
}

public byte[] getResgistro_nascimento_aluno() {
	return resgistro_nascimento_aluno;
}

public void setResgistro_nascimento_aluno(byte[] resgistro_nascimento_aluno) {
	this.resgistro_nascimento_aluno = resgistro_nascimento_aluno;
}

public byte[] getIdentidade_frente_responsavel() {
	return identidade_frente_responsavel;
}

public void setIdentidade_frente_responsavel(byte[] identidade_frente_responsavel) {
	this.identidade_frente_responsavel = identidade_frente_responsavel;
}

public byte[] getIdentidade_verso_responsavel() {
	return identidade_verso_responsavel;
}

public void setIdentidade_verso_responsavel(byte[] identidade_verso_responsavel) {
	this.identidade_verso_responsavel = identidade_verso_responsavel;
}

public byte[] getComprovante_residencia() {
	return comprovante_residencia;
}

public void setComprovante_residencia(byte[] comprovante_residencia) {
	this.comprovante_residencia = comprovante_residencia;
}

public byte[] getFator_rh() {
	return fator_rh;
}

public void setFator_rh(byte[] fator_rh) {
	this.fator_rh = fator_rh;
}

public byte[] getNada_consta() {
	return nada_consta;
}

public void setNada_consta(byte[] nada_consta) {
	this.nada_consta = nada_consta;
}

@Override
public String toString() {
	return "Documentacao [id=" + id + ", data_envio=" + data_envio + "]";
}
  
  
}

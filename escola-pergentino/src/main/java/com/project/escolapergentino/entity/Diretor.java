package com.project.escolapergentino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "diretor")
public class Diretor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name = "setor", nullable = false, length=25)
	private String setor;
	@Column(name = "funcionario_id", nullable = false)
    private Long funcionarioId;

    @OneToOne(mappedBy = "diretor")
    @JoinColumn(name = "funcionario_id", nullable = false, insertable = false, updatable = false)
    private Funcionario funcionario;
   
   public Diretor() {
	// TODO Auto-generated constructor stub
}
   
public Diretor(Long id, String setor) {
	super();
	this.id = id;
	this.setor = setor;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getSetor() {
	return setor;
}

public void setSetor(String setor) {
	this.setor = setor;
}

@Override
public String toString() {
	return "Diretor [id=" + id + ", setor=" + setor + "]";
}


   
   
   
}

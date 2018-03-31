package com.sesame.ing4b.dealboxSKW.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partenaire implements Serializable {

	@Id
	private Long id;
	private String nom;
	private String type;
	
	@ManyToOne
	@JoinColumn(name="id_domaine")
	private Domaine domaine;
	
	
	public Partenaire(Long id, String nom, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
	}
	public Partenaire() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}

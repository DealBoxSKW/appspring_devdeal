package com.sesame.ing4b.dealboxSKW.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Service implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String Description;
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="id_deal")
	private Deal deal;
	
	
	public Service(Long id, String libelle, String description, double prix) {
		super();
		this.id = id;
		this.libelle = libelle;
		Description = description;
		this.prix = prix;
	}
	public Service() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}

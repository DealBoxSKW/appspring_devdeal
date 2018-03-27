package com.sesame.ing4b.dealboxSKW.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ville;
	private String rue;
	private int codePostal;
	private int numLocal;
	private String detail;
	
	@ManyToOne
	@JoinColumn(name="id_partenaire")
	private Partenaire partenaire;
	
	
	public Adresse() {
		super();
	}
	public Adresse(Long id, String ville, String rue, int codePostal, int numLocal, String detail) {
		super();
		this.id = id;
		this.ville = ville;
		this.rue = rue;
		this.codePostal = codePostal;
		this.numLocal = numLocal;
		this.detail = detail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public int getNumLocal() {
		return numLocal;
	}
	public void setNumLocal(int numLocal) {
		this.numLocal = numLocal;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}

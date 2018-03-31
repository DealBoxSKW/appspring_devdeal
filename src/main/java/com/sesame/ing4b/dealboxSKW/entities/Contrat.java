package com.sesame.ing4b.dealboxSKW.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrat implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateContrat;
	private Double pousentage;
	private String detail;
	
	@ManyToOne
	@JoinColumn(name="id_partenaire")
	private Partenaire partenaire;
	
	
	public Contrat(Long id, Date dateContrat, Double pousentage, String detail) {
		super();
		this.id = id;
		this.dateContrat = dateContrat;
		this.pousentage = pousentage;
		this.detail = detail;
	}


	public Contrat() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateContrat() {
		return dateContrat;
	}


	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}


	public Double getPousentage() {
		return pousentage;
	}


	public void setPousentage(Double pousentage) {
		this.pousentage = pousentage;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
	
	

}

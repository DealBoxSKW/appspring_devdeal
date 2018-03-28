package com.sesame.ing4b.dealboxSKW.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Deal implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private double prixReel;
	private double prixReduction;
	private String detail;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne
	@JoinColumn(name="id_partenaire")
	private Partenaire partenaire;
	
	@OneToMany(mappedBy="deal")
	private Collection<Service> services;
	
	
	public Deal(Long id, String titre, double prixReel, double prixReduction, String detail, Date dateDebut,
			Date dateFin) {
		super();
		this.id = id;
		this.titre = titre;
		this.prixReel = prixReel;
		this.prixReduction = prixReduction;
		this.detail = detail;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Deal() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Deal [id=" + id + ", titre=" + titre + ", prixReel=" + prixReel + ", prixReduction=" + prixReduction
				+ ", detail=" + detail + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrixReel() {
		return prixReel;
	}

	public void setPrixReel(double prixReel) {
		this.prixReel = prixReel;
	}

	public double getPrixReduction() {
		return prixReduction;
	}

	public void setPrixReduction(double prixReduction) {
		this.prixReduction = prixReduction;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	
	
	
}

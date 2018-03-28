package com.sesame.ing4b.dealboxSKW.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private boolean type;
	private String telephone;
	private String mail ;
	private String fax;
	
	@ManyToOne
	@JoinColumn(name="id_partenaire")
	private Partenaire partenaire;
	
	
	
	
	
	public Contact() {
		super();
	}
	public Contact(Long id, boolean type, String telephone, String mail, String fax) {
		super();
		this.id = id;
		this.type = type;
		this.telephone = telephone;
		this.mail = mail;
		this.fax = fax;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
	

}

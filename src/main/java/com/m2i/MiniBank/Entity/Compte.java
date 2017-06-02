package com.m2i.MiniBank.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_COMPTE")
public class Compte {


	private float solde;

	private Date dateouverture;

	private Long IDcompte;

	private float decouvert;



	@Column(name = "SOLDE_COMPTE")
	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Column(name = "DATE_COMPTE")
	public Date getDateouverture() {
		return dateouverture;
	}

	public void setDateouverture(Date dateouverture) {
		this.dateouverture = dateouverture;
	}

	@Id
	@Column(name = "COMPTE_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIDcompte() {
		return IDcompte;
	}

	public void setIDcompte(Long iDcompte) {
		IDcompte = iDcompte;
	}

	@Column(name = "DECOUVERT_COMPTE")
	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	public Compte( float solde, float decouvert) {

		this.solde = solde;
		this.decouvert = decouvert;
	}

	public void ajout(float argent) {
		this.solde += argent;
		
	}

	public void retrait(float argent){
        this.solde -= argent;
}

	public void virement(Compte cb, float argent){
    this.retrait(argent);
    cb.ajout(argent);
}
	
}
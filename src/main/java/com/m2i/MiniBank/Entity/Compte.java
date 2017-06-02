package com.m2i.MiniBank.Entity;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Compte {

	public long getNumerocompte() {
		return numerocompte;
	}

	public void setNumerocompte(long numerocompte) {
		this.numerocompte = numerocompte;
	}

	public long getSolde() {
		return solde;
	}

	public void setSolde(long solde) {
		this.solde = solde;
	}

	public Date getDateouverture() {
		return dateouverture;
	}

	public void setDateouverture(Date dateouverture) {
		this.dateouverture = dateouverture;
	}

	public long getIDcompte() {
		return IDcompte;
	}

	public void setIDcompte(long iDcompte) {
		IDcompte = iDcompte;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	private long numerocompte;

	public long solde;

	public Date dateouverture;

	public long IDcompte;

	public float decouvert;

}
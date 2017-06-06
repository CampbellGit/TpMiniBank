package com.m2i.MiniBank.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENT")
@ManagedBean(name = "Client")
public class Client {
	/* {src_lang=Java} */
	
	private Long clientID;
	
	private String nom;

	private String prenom;

	private String adresse;

	private Long CP;

	private String Ville;

	private Long Telephone;

	private Long IDagence;
	

	@Id
	@Column(name="CLIENT_ID", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getClientID() {
		return clientID;
	}

	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}

	@Column(name="NOM_CLIENT")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name="PRENOM_CLIENT")
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Column(name="ADRESSE_CLIENT")
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Column(name="CP_CLIENT")
	public Long getCP() {
		return CP;
	}

	public void setCP(Long cP) {
		CP = cP;
	}
	@Column(name="VILLE_CLIENT")
	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}
	@Column(name="TELEPHONE_CLIENT")
	public Long getTelephone() {
		return Telephone;
	}

	public void setTelephone(Long telephone) {
		Telephone = telephone;
	}
	
	@Column(name="IDAGENCE_CLIENT")
	public Long getIDagence() {
		return IDagence;
	}

	public void setIDagence(Long iDagence) {
		IDagence = iDagence;
	}

	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Client() {}

	public Client(String nom, String prenom, String adresse, Long cP, String ville, Long telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		CP = cP;
		Ville = ville;
		Telephone = telephone;
	}	
	
	
	private Set<Compte> comptes = new HashSet<Compte>(0);

	public Client(String nom, String prenom, String adresse, Long cP, String ville, Long telephone, Set<Compte> comptes) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	CP = cP;
	Ville = ville;
	Telephone = telephone;
	this.comptes = comptes;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "T_CLIENT_COMPTES", 
	joinColumns = { @JoinColumn(name = "CLIENT_ID") }, 
	inverseJoinColumns = { @JoinColumn(name = "COMPTE_ID")})
	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}	
	

	
}
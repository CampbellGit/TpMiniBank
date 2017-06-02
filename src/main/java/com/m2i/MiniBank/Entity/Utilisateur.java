package com.m2i.MiniBank.Entity;

import java.util.HashSet;
import java.util.Set;

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

import com.m2i.MiniBank.Entity.Role;

@Entity
@Table(name = "T_UTIISATEUR")
public class Utilisateur {

	private long utilisateurID;

	private String login;

	private String password;

	private String nom;

	private String prenom;

	private long clientID;

	private boolean enabled;
	
	private Set<Role> role_user = new HashSet<Role>(0);

	@Id
	@Column(name = "UTILISATEUR_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getUtilisateurID() {
		return utilisateurID;
	}
	
	@Column(name="UTILISATEUR_LOGIN")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name="UTILISATEUR_PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="UTILISATEUR_NOM")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name="UTILISATEUR_PRENOM")
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Column(name="UTILISATEUR_CLIENTID")
	public long getClientID() {
		return clientID;
	}

	public void setClientID(long clientID) {
		this.clientID = clientID;
	}

	public void setUtilisateurID(long utilisateurID) {
		this.utilisateurID = utilisateurID;
	}
	
	@Column(name="ENABLED", nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "T_USER_ROLES", 
	joinColumns = { @JoinColumn(name = "USER_ID") }, 
	inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public Set<Role> getRole_user() {
		return role_user;
	}

	public void setRole_user(Set<Role> role_user) {
		this.role_user = role_user;
	}

	public Utilisateur(String login, String password, String nom, String prenom) {
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Utilisateur(){
		
	}
	

}
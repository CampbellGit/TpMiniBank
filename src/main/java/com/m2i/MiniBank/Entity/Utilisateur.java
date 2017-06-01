package com.m2i.MiniBank.Entity;

public class Utilisateur {


  private long utilisateurID;

  private String login;

  private String password;

  private int role;

  private String nom;

  private String prenom;

  private long clientID;

  private void listerClients() {
  }

  public void identifier() {
  }

public long getUtilisateurID() {
	return utilisateurID;
}


public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getRole() {
	return role;
}

public void setRole(int role) {
	this.role = role;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public long getClientID() {
	return clientID;
}

public void setClientID(long clientID) {
	this.clientID = clientID;
}

public void setUtilisateurID(long utilisateurID) {
	this.utilisateurID = utilisateurID;
}
  

}
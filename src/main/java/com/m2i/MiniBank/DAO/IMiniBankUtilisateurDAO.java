package com.m2i.MiniBank.DAO;

import java.util.List;

import com.m2i.MiniBank.Entity.Utilisateur;

public interface IMiniBankUtilisateurDAO {
	public void addOrUpdateUtilisateur(Utilisateur u);
	public void removeUtilisateur(Utilisateur u); 
	public Utilisateur findUtilisateurById(int id);
	public List<Utilisateur> findAllUtilisateurs();
	
}


package com.m2i.MiniBank.service;

import java.util.List;

import com.m2i.MiniBank.Entity.Utilisateur;

public interface IMiniBankUtilisateurService {
	public void addOrUpdateUtilisateur(Utilisateur u);
	public void removeUtilisateur(Utilisateur u); 
	public Utilisateur findUtilisateurById(int id);

	public List<Utilisateur> findAllUtilisateurs();
}

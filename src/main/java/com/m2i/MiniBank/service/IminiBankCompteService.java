package com.m2i.MiniBank.service;

import java.util.List;

import com.m2i.MiniBank.Entity.Compte;

public interface IminiBankCompteService {
	public void addOrUpdateCompte(Compte c);
	public void removeCompte(Compte c);
	public Compte findCompteById(int id);
	public List<Compte> findAllComptes();
}

package com.m2i.MiniBank.DAO;

import java.util.List;

import com.m2i.MiniBank.Entity.Compte;

public interface IMiniBankCompteDAO {
	public void addOrUpdateCompte(Compte c);
	public void removeCompte(Compte c);
	public Compte findCompteById(int id);
	public List<Compte> findAllComptes();
}

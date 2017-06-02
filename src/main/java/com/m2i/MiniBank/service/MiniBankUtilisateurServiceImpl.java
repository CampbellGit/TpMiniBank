package com.m2i.MiniBank.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.m2i.MiniBank.DAO.IMiniBankUtilisateurDAO;
import com.m2i.MiniBank.Entity.Utilisateur;

@Service("MiniBankService")
public class MiniBankUtilisateurServiceImpl implements IMiniBankUtilisateurService {
	
	@Resource(name="MiniBankDAO")
	IMiniBankUtilisateurDAO miniBankDAO;

	@Override
	@Transactional
	public void addOrUpdateUtilisateur(Utilisateur u) {
		miniBankDAO.addOrUpdateUtilisateur(u);
		
	}

	@Override
	@Transactional
	public void removeUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		
	}


	@Override
	@Transactional
	public Utilisateur findUtilisateurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional
	public List<Utilisateur> findAllUtilisateurs() {
		// TODO Auto-generated method stub
		return null;
	}
	




}

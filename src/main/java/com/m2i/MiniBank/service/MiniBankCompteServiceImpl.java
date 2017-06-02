package com.m2i.MiniBank.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.m2i.MiniBank.DAO.IMiniBankCompteDAO;
import com.m2i.MiniBank.Entity.Compte;

@Service("MiniBankCompteService")
public class MiniBankCompteServiceImpl implements IminiBankCompteService{

	@Resource(name="MiniBankCompteDAO")
	IMiniBankCompteDAO miniBankCompteDAO;
	
	
	@Override
	@Transactional
	public void addOrUpdateCompte(Compte c) {
		miniBankCompteDAO.addOrUpdateCompte(c);
		
	}

	@Override
	@Transactional
	public void removeCompte(Compte c) {
		miniBankCompteDAO.removeCompte(c);
		
	}
	
	@Override
	@Transactional
	public Compte findCompteById(int id) {
		return miniBankCompteDAO.findCompteById(id);
	}

	@Override
	@Transactional
	public List<Compte> findAllComptes() {
		return miniBankCompteDAO.findAllComptes();
	}

}

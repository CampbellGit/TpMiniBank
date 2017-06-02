package com.m2i.MiniBank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.m2i.MiniBank.DAO.MiniBankCompteDAOImpl;
import com.m2i.MiniBank.Entity.Compte;

public class MiniBankCompteDAOImplTest {
	static MiniBankCompteDAOImpl comptetest;
	static MiniBankCompteDAOImpl comptetest2;

	@Test
	public void testAddOrUpdateCompte() {
		comptetest = new MiniBankCompteDAOImpl();
		Compte u = new Compte(0f, 666f);
		u.ajout(10.00f);
		
		comptetest2 = new MiniBankCompteDAOImpl();
		Compte u2 = new Compte(100f, 666f);
		u2.retrait(20f);
		u.virement(u2, 5f);
		comptetest.addOrUpdateCompte(u);
		comptetest.addOrUpdateCompte(u2);
		
	}

}

package com.m2i.MiniBank;

import org.junit.Test;

import com.m2i.MiniBank.DAO.MiniBankUtilisateurDAOImpl;
import com.m2i.MiniBank.Entity.Utilisateur;

public class MiniBankUtilisateurDAOImplTest {
	
	static MiniBankUtilisateurDAOImpl minibankTest;

	@Test
	public void testAddOrUpdateUtilisateur() {
		minibankTest = new MiniBankUtilisateurDAOImpl();
		Utilisateur u = new Utilisateur("Michel", "Truc", "Michel", "Truc");
		minibankTest.addOrUpdateUtilisateur(u);
	}

}

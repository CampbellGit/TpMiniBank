package com.m2i.MiniBank;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.m2i.MiniBank.DAO.MiniBankClientDAOImpl;
import com.m2i.MiniBank.Entity.Client;
import com.m2i.MiniBank.Entity.Compte;

public class MiniBankClientDAOTest {
	static MiniBankClientDAOImpl minibankClientTest;

	@Test
	public void ajouterClientTest() {
		minibankClientTest = new MiniBankClientDAOImpl();
		Compte compte= new Compte(10000L, 500F);
		Client client = new Client("TESTJOIN", "TESTJOIN", "TESTJOIN", 0000L, "TESTJOIN", 0000L);
		minibankClientTest.ajouterClient(client);
	}
}

package com.m2i.MiniBank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.m2i.MiniBank.DAO.MiniBankClientDAOImpl;
import com.m2i.MiniBank.Entity.Client;

public class MiniBankClientDAOTest {
	static MiniBankClientDAOImpl minibankClientTest;

	@Test
	public void ajouterClientTest() {
		minibankClientTest = new MiniBankClientDAOImpl();
		Client client = new Client("dom", "ccc", "11rue12", "bretagne", 1111111);
		minibankClientTest.ajouterClient(client);
	}
}

package com.m2i.MiniBank.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.m2i.MiniBank.DAO.IMiniBankClientDAO;
import com.m2i.MiniBank.Entity.Client;


@Service("MiniBankClientService")

public class MiniBankClinetServiceImpl implements IMininBankClientService{

	@Resource(name="MiniBankClientDAO")
	IMiniBankClientDAO MiniBankClientDAO;
	
	@Override
	@Transactional
	public void ajouterClient (Client client)  {
		MiniBankClientDAO.ajouterClient(client);
	}
	
	@Override
	@Transactional
	public void supprimerClient(Client client) {
		MiniBankClientDAO.supprimerClient(client);
	}
	@Override
	@Transactional
	public Client listerClientParId(Long id) {
		return MiniBankClientDAO.listerClientParId(id);
	}
	
	@Override
	@Transactional
	public List<Client> listerClients() {
		return MiniBankClientDAO.listerClients();
	}
	
}

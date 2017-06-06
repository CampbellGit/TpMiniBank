package com.m2i.MiniBank.DAO;

import java.util.List;

import com.m2i.MiniBank.Entity.Client;

public interface IMiniBankClientDAO {
	
	public void ajouterClient(Client client);
	public void supprimerClient(Client client) ;
	public Client listerClientParId(Long id);	
	public List<Client> listerClients();

}

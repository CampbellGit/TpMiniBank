package com.m2i.MiniBank.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.m2i.MiniBank.DAO.Util.HibernateUtil;
import com.m2i.MiniBank.Entity.Client;




@Repository("MiniBankClientDAO")
public class MiniBankClientDAOImpl implements IMiniBankClientDAO {
	
	
	public void ajouterClient(Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(client);
		tx.commit();
		session.close();
	}
	public void supprimerClient(Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Client tempU = (Client) session.load(Client.class, client.getClientID());
		if (null != tempU) {
			session.delete(tempU);
		}
		tx.commit();
		session.close();
	}
	public Client listerClientParId(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Client client = (Client) session.load(Client.class, id);
		return client;
	}
	public List<Client> listerClients() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Client> listeClients = session.createQuery("from Client").list();
		return listeClients;
	}

}

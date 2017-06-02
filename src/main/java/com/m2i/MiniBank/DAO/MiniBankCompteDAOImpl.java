package com.m2i.MiniBank.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.m2i.MiniBank.DAO.Util.HibernateUtil;
import com.m2i.MiniBank.Entity.Compte;
import com.m2i.MiniBank.Entity.Utilisateur;
@Repository("MiniBankCompteDAO")
public class MiniBankCompteDAOImpl implements IMiniBankCompteDAO {

	@Override
	public void addOrUpdateCompte(Compte c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(c);
		tx.commit();
		session.close();
		
	}

	@Override
	public void removeCompte(Compte c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Utilisateur tempC = (Utilisateur) session.load(Utilisateur.class, c.getIDcompte());
		if (null != tempC) {
			session.delete(tempC);
		}
		tx.commit();
		session.close();
		
	}

	@Override
	public Compte findCompteById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Compte c = (Compte) session.load(Compte.class, id);
		return c;
	}

	@Override
	public List<Compte> findAllComptes() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Compte> listcomptes = session.createQuery("from Compte").list();
		return listcomptes;
	}

}

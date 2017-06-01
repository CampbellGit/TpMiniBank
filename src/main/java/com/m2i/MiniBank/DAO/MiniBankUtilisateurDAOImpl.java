package com.m2i.MiniBank.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.m2i.MiniBank.DAO.Util.HibernateUtil;
import com.m2i.MiniBank.Entity.Utilisateur;

@Repository("MiniBankDAO")
public class MiniBankUtilisateurDAOImpl implements IMiniBankUtilisateurDAO {

	public void addOrUpdateUtilisateur(Utilisateur u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(u);
		tx.commit();
		session.close();
		
	}

	public void removeUtilisateur(Utilisateur u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Utilisateur tempU = (Utilisateur) session.load(Utilisateur.class, u.getUtilisateurID());
		if (null != tempU) {
			session.delete(tempU);
		}
		tx.commit();
		session.close();
		
	}

	public Utilisateur findUtilisateurById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Utilisateur u = (Utilisateur) session.load(Utilisateur.class, id);
		return u;
	}

	public List<Utilisateur> findAllUtilisateurs() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Utilisateur> userslist = session.createQuery("from User").list();
		return userslist;
	}

}

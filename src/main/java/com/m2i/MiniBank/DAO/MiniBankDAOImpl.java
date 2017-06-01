package com.m2i.MiniBank.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.m2i.MiniBank.Entity.Utilisateur;

@Repository("MiniBankDAO")
public class MiniBankDAOImpl implements IMiniBankDAO {

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
		User tempU = (User) session.load(User.class, u.getId());
		if (null != tempU) {
			session.delete(tempU);
		}
		tx.commit();
		session.close();
		
	}

	public Utilisateur findUtilisateurById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User u = (User) session.load(User.class, id);
		return u;
	}

	public List<Utilisateur> findAllUtilisateurs() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<User> userslist = session.createQuery("from User").list();
		return userslist;
	}

}

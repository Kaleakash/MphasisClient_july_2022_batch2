package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Trainer;

public class TrainerDao {

	public int storeTrainer(Trainer trainer) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(trainer);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Trainer> findAllTrainer() {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			TypedQuery qry = session.createQuery("select t from Trainer t");
			List<Trainer> listOfTrainer = qry.getResultList();
			return listOfTrainer;
	}
	
	public List<Object[]> findTrainerAndStudentDetails() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select t.tname,t.tech s.sname from Trainer t, Student s where t.tid = s.tsid");
		List<Object[]> listOfTrainer = qry.getResultList();
		return listOfTrainer;
}
}

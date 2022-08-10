package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Question q1 = new Question();
		q1.setQid(2);
		q1.setQuestion("What is Java");
		String ans[]= {"Java is OOP","Java is not OOP","Java is platform dependent","Java is not secure"};
		q1.setAnswers(ans);
		q1.setCorrectAnswer("Java is OOP");
		
		tran.begin();
			session.save(q1);
		tran.commit();
		System.out.println("Stored");
		//System.out.println("Table created....");
	}

}

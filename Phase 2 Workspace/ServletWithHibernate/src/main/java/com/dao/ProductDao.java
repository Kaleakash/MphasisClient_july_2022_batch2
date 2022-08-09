package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Product;

public class ProductDao {

		public int storeProduct(Product product) {
			try {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				
				Transaction tran = session.getTransaction();
				tran.begin();
						session.save(product);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
		
		public int deleteProduct(int pid) {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				// select * from product where pid = 100;
				
				Product pp	= session.get(Product.class, pid);
				
				if(pp==null) {
					return 0;
				}else {
					tran.begin();	
					
					session.delete(pp);
					
					tran.commit();
					return 1;
				}
			
		}
		
		
		public int updateProduct(Product product) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			Product pp	= session.get(Product.class, product.getPid());
			if(pp==null) {
				return 0;
			}else {
				tran.begin();	
				
				pp.setPrice(product.getPrice());    
				//pp.setPrice(pp.getPrice()+100);
					session.update(pp); // update Product set price = newprice where pid = 100    
				tran.commit();
				return 1;
			}
		
	}
		
		
	public Product findProduct(int pid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Product pp	= session.get(Product.class, pid);
		return pp;
	}	
	
	
	public List<Product> findAllProduct() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry	= session.createQuery("select p from Product p");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	public List<Product> findAllProductUsingPrice(float price) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		// static where clause 
		//TypedQuery qry	= session.createQuery("select p from Product p where p.price > 5000");
		// dynamic value using label query 
		TypedQuery qry	= session.createQuery("select p from Product p where p.price > :myPrice");
		qry.setParameter("myPrice", price);
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	// this method retreive only name 
	public List<String> retrieveOnlyProductName() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		// static where clause 
		TypedQuery qry	= session.createQuery("select p.pname from Product p");
		List<String> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	// this method retreive only price 
	public List<Float> retrieveOnlyProductPrice() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		// static where clause 
		TypedQuery qry	= session.createQuery("select p.price from Product p");
		List<Float> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	// this method retreive partial object  
		public List<Object[]> retrieveProductNameAndPrice() {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			// static where clause 
			TypedQuery qry	= session.createQuery("select p.pname,p.price from Product p");
			List<Object[]> listOfProduct = qry.getResultList();
			return listOfProduct;
		}
		
		
}




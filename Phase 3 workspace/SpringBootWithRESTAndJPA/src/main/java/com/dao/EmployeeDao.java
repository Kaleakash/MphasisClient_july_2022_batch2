package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;		// it will do di for applicaton.properties							// SessionFactory sf;
	
	public Employee getEmployeeDetails(int id) {
		EntityManager manager = emf.createEntityManager();					// Session in Hibernate 
		Employee emp = manager.find(Employee.class, id);					// session.get(Employee.class,id)
		return emp;
	}
	
	public List<Employee> getAllEmployeeDetails() {
		EntityManager manger = emf.createEntityManager();
		Query qry = manger.createQuery("select e from Employee e");  			// JPQL 
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public int storeEmployee(Employee emp) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(emp);							// session.save(emp)
			tran.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
}

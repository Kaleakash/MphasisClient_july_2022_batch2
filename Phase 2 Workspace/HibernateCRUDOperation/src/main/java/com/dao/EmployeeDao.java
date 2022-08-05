package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {

//	public int storeEmployee(Employee emp) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
//PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//pstmt.setInt(1, emp.getId());
//pstmt.setString(2, emp.getName());
//pstmt.setFloat(3, emp.getSalary());
//		int res = pstmt.executeUpdate();
//		return res;
//		} catch (Exception e) {
//			System.out.println(e);
//			return 0;
//		}
//	}
//	
	public int storeEmployee(Employee emp) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");				// load the xml file
		SessionFactory sf = con.buildSessionFactory();		// Connection con;
		Session session = sf.openSession();				// Statement or PreparedStatement 
		
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(emp);								// insert query 
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
	
	
//	public List<Employee> getAllEmployee() {
//		List<Employee> listOfEmp =new ArrayList<Employee>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
//PreparedStatement pstmt = con.prepareStatement("select * from employee");
//		ResultSet rs = pstmt.executeQuery();
//		while(rs.next()) {
//			Employee emp  = new Employee();
//			emp.setId(rs.getInt(1));
//			emp.setName(rs.getString(2));
//			emp.setSalary(rs.getFloat(3));
//			listOfEmp.add(emp);
//		}
//		} catch (Exception e) {
//		}
//		return listOfEmp;
//	}
	
	
}

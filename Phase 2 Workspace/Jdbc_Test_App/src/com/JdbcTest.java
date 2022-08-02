package com;
import java.sql.*;
import java.util.Scanner;
public class JdbcTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL Database 8.x version 
			//Class.forName("com.mysql.jdbc.Driver"); 	// MySQL Database 5.x version 
			System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
System.out.println("Connected successfully");
		
		Statement stmt = con.createStatement();
		System.out.println("Statement is ready...");
		
		Scanner obj = new Scanner(System.in);
		
		// insert operation  using Statement 
//		int res	= stmt.executeUpdate("insert into employee values(5,'Mahesh',25000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		
		// insert operation using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		System.out.println("Enter the id");
//		int id = obj.nextInt();
//			pstmt.setInt(1, id);
//		System.out.println("Enter the name");
//		String name = obj.next();
//			pstmt.setString(2, name);
//		System.out.println("Enter the salary");
//		float salary = obj.nextFloat();
//			pstmt.setFloat(3, salary);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record inserted succesfully");
//		}
		
//		// delete query using Statement 
//		int res = stmt.executeUpdate("delete from employee where id = 5");
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// Delete Query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
//		System.out.println("Enter the id to delete the record");
//		int id = obj.nextInt();
//		pstmt.setInt(1, id);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// update query using Statement 
//		int res = stmt.executeUpdate("update employee set salary = 45000 where id=10");
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		//update query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
//		System.out.println("Enter the id to update the salary");
//		int id = obj.nextInt();
//		pstmt.setInt(2, id);
//		System.out.println("Enter the salary");
//		float salary = obj.nextFloat();
//		pstmt.setFloat(1, salary);
//		
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		
		// retrieve query using Statement  
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
//		}
		
		// retreive query using preparedStatement 
		//PreparedStatement pstmt = con.prepareStatement("select * from employee");
		PreparedStatement pstmt = con.prepareStatement("select * from employee where salary > ?");
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();
		pstmt.setFloat(1, salary);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
			//System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			System.out.println("name is "+rs.getString(2));
		}
		
		//rs.close();
		stmt.close();		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

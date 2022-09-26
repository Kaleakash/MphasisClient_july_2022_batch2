package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Account;

public class AccountDao {

	public int createAccount(Account account) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("insert into account values(?,?,?)");
	pstmt.setInt(1, account.getAccno());
	pstmt.setString(2, account.getName());
	pstmt.setFloat(3, account.getAmount());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
				return 0;
		}
	}
	
	public float findBalance(int accno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("select amount from account where accno =?");
	pstmt.setInt(1, accno);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		return rs.getFloat(1);
	}else {
		return -1;
	}
		} catch (Exception e) {
			System.out.println(e);
				return 0;
		}
	}
	
	public float withdrawn(Account account) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("update account set amount = amount -? where accno = ?");
	pstmt.setFloat(1, account.getAmount());
	pstmt.setInt(2, account.getAccno());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
				return -1;
		}
	}
	public float deposit(Account account) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("update account set amount = amount + ? where accno = ?");
	pstmt.setFloat(1, account.getAmount());
	pstmt.setInt(2, account.getAccno());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
				return -1;
		}
	}
}

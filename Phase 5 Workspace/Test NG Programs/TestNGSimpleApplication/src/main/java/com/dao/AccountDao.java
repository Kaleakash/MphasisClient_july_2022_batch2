package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
}

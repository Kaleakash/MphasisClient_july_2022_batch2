package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Repository;
import com.bean.Login;

@Repository
public class LoginDao {
	public int signIn(Login login) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root" , "root@123");
		PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
		pstmt.setString(1, login.getEmail());
		pstmt.setString(2, login.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			return 1;
		}
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		return 0;
	}
	public int signUp(Login login) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root" , "root@123");
		PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
		pstmt.setString(1, login.getEmail());
		pstmt.setString(2, login.getPassword());
		int res = pstmt.executeUpdate();
		if(res>0) {
			return 1;
		}
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		return 0;
	}
}

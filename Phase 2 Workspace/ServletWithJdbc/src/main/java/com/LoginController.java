package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
			PreparedStatement pstmt = con.prepareStatement("select * from login where emailid=? and password = ?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			ResultSet rs  = pstmt.executeQuery();
			if(rs.next()) {
				pw.println("successfully login");
				rd1.forward(request, response);          // we can see only output of target page 
			}else {
				pw.println("failure try once again");
				rd2.include(request, response);    
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");			//output consider as html not a text      
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");	
		RequestDispatcher rd1 = request.getRequestDispatcher("index.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			int res	= pstmt.executeUpdate();
			if(res>0) {
				pw.println("Account Created successfully");
			}
		} catch (Exception e) {
			System.out.println(e);
			pw.println("Account didn't create, Email Id must be unique");
		}

		rd1.include(request, response);
	}

}

package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginApp
 */
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("uname");  // receive uname from text field 
		String password = request.getParameter("pwd");
		//pw.println("Welcome user "+username);
		if(username.equals("akash") && password.equals("123")) {
			pw.println("successfully login with get method");
		}else {
			pw.println("failure try once again with get method");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("uname");  // receive uname from text field 
		String password = request.getParameter("pwd");
		//pw.println("Welcome user "+username);
		if(username.equals("akash") && password.equals("123")) {
			pw.println("successfully login with post method");
		}else {
			pw.println("failure try once again with post method");
		}
	}

}

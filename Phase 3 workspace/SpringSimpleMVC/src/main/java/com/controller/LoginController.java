package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) {			// DI for HttpServletRequest 
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			ModelAndView mav = new ModelAndView();
			
			if(email.equals("raj@gmail.com") && password.equals("123")) {
				mav.setViewName("success.jsp");
			}else {
				mav.setViewName("failure.jsp");
			}
			
			return mav;
	}
}

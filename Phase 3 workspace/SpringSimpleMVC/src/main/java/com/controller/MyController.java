package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller				// this class like servlet. 
public class MyController {

	// doGet method with meaningful method name 
	
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		System.out.println("I Came here");
		mav.setViewName("display.jsp");	// RD forward 
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {
		ModelAndView mav = new ModelAndView();
		System.out.println("I Came here");
		mav.setViewName("display1.jsp");	// RD forward 
		return mav;
	}
}

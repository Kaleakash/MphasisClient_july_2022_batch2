package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(value = "firstClient")
	public String sayHello() {
		return "Welcome to Spring boot with first micro service client";
	}
}

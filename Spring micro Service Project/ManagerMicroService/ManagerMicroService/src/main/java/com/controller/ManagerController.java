package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("manager")
public class ManagerController {

	
	@Autowired
	RestTemplate restTemplate;
	
	// http://localhost:8484/manager/say
	@GetMapping(value = "say")
	public String sayHelloByManager() {
		return "Welcome to Spring manager micro service";
	}
	
	// http://localhost:8484/manager/findEmployeeThroughManager/1
	
	@GetMapping(value = "findEmployeeThroughManager/{empId}")
	public String getEmployeeDetails(@PathVariable("empId") int empid) {
return restTemplate.getForObject("http://employee-micro-service-client:8383/employees/findEmployeeById/"+empid, String.class);
	}
}

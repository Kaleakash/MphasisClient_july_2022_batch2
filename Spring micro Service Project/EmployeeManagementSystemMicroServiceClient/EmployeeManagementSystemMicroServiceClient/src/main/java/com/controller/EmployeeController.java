package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

 // http://localhost:8383/employees 

@RestController
@RequestMapping("employees")
public class EmployeeController {


	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8383/employees/findAll 
	
	//@RequestMapping(value = "findAll",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
}

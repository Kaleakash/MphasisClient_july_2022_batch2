package com.controller;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// http://localhost:8383/employees/storeEmployee
	@PostMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployee(emp);
	}
	
	// http://localhost:8383/employees/updateEmployee
	@PutMapping(value = "updateEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployeeSalary(emp);
	}
	
	// http://localhost:8383/employees/deleteEmployee/1
	
	@DeleteMapping(value = "deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	// http://localhost:8383/employees/findEmployeeById/1
	
	@GetMapping(value = "findEmployeeById/{id}")
	public String findEmployee(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
}

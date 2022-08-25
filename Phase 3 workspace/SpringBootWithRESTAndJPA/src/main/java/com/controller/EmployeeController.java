package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/employee 
	@RequestMapping(value = "employee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfo() {
		Employee emp1 = new Employee(100, "Ajay", 14000);
		return emp1;
	}
	// http://localhost:8080/employees
	@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ramesh", 12000));
		listOfEmp.add(new Employee(2, "Ajay", 15000));
		listOfEmp.add(new Employee(3, "Dinesh", 18000));
		return listOfEmp;
	}
	
		// http://localhost:8080/employeesFromDb
		@RequestMapping(value = "employeesFromDb",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getAllEmployeeDetailsFromDb() {
				return employeeService.getAllEmployee();
		}
		
		// http://localhost:8080/findEmployeeById/1				using path param 
		// http://localhost:8080/findEmployeeById/100			using path param 
		
		@RequestMapping(value = "findEmployeeById/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee findEmployeeById(@PathVariable("id") int eid) {
			return employeeService.findEmployeeById(eid);
		}
		
		// http://localhost:8080/storeEmployee 			{"id":100,"name":"Ramesh","salary":34000}
		
		@RequestMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
		public String storeEmployee(@RequestBody Employee emp) {		// scan the value from reqeust body in the form json 
			return employeeService.storeEmployee(emp);
		}
		
}


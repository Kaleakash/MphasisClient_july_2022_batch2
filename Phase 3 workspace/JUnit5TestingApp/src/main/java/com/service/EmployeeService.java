package com.service;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	public boolean checkUser(String name, String pass) {
		if(name.equals("Raj") && pass.equals("123")) {
			return true;
		}else {
			return false;
		}
	}	
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		return emp;
	}
	public List<Employee> getAllEmployees() {
		Employee emp1 = new Employee(1, "Raju", 14000);
		Employee emp2 = new Employee(2, "Raj", 16000);
		Employee emp3 = new Employee(3, "Ramesh", 18000);
		List<Employee> listOfemp = new ArrayList<>();
		listOfemp.add(emp1); listOfemp.add(emp2); listOfemp.add(emp3);
		return listOfemp;
	}
}

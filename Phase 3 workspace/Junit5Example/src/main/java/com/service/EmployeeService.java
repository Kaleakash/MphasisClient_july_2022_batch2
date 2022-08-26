package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {	
	public String checkUser(String emailid, String password) {
		if(emailid.equals("raj@gmail.com") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		return emp;
	}
	public List<Employee> listOfEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(12000);
		
		Employee emp2 = new Employee();
		emp2.setId(200);
		emp2.setName("Raj");
		emp2.setSalary(14000);
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		
		return listOfEmp;
	}
	public float passEmployeeObject(Employee emp) {
		// with condition 
		return emp.getSalary()+500;
	}
}

package com;

import java.util.Collections;
import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
	EmployeeService es = new EmployeeService();
	List<Employee> listOfEmp = es.displayEmployeeDetails();
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}

									Collections.sort(listOfEmp);			// it will check which value stored and that class must be implements Comparable interface 
									
	System.out.println("After sort ");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	}

}

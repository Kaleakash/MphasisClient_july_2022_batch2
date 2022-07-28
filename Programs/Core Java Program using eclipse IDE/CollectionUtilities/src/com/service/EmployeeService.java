package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
		List<Employee> listOfEmp;
		
		public EmployeeService() {
			listOfEmp = new ArrayList<Employee>();
			listOfEmp.add(new Employee(2, "Ramesh", 12000));
			listOfEmp.add(new Employee(1, "Ajay", 13000));
			listOfEmp.add(new Employee(4, "Ramesh", 20000));
			listOfEmp.add(new Employee(3, "Vijay", 16000));
			listOfEmp.add(new Employee(5, "Lokesh", 18000));
		}
		
		public List<Employee> displayEmployeeDetails() {
			return listOfEmp;
		}
}

package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {		// pure business logic 

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<10000) {
			return "Employee salary must be > 10000";
		}else if(ed.storeEmployee(emp)>0) {
			return "Record inserted successfully";
		}else {
			return "Record didn't insert";
		}
	}
	
	
//	public List<Employee> getAllEmployee() {
//		List<Employee> listOfEmp = ed.getAllEmployee();
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			emp.setSalary(emp.getSalary()+5000);
//		}
//		
//		return listOfEmp;
//	}
}

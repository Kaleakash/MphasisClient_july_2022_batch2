package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public Employee findEmployeeById(int id) {
		return employeeDao.getEmployeeDetails(id);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployeeDetails();
	}
	
	public String storeEmployee(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored";
		}else {
			return "Record didn't store";
		}
	}
}

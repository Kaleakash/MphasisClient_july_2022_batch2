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
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployeeDetails(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record didn't delete";
		}
	}
	
	public String updateEmployee(Employee emp) {
		Employee employeeFromDb = employeeDao.getEmployeeDetails(emp.getId());
		if(employeeFromDb==null) {
			return "Employee record not present we can't update";
		}else if(emp.getSalary()>employeeFromDb.getSalary()) {
					if(employeeDao.updateEmployeeSalary(emp)>0) {
						return "Salary updated";
					}else {
						return "Salary didn't update";
					}
		}else {
			return "New Salary must be > than old salary";
		}
	}
}

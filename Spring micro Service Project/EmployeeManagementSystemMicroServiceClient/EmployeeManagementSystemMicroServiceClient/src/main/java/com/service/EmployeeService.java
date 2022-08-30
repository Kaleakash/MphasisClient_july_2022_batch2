package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public String storeEmployee(Employee emp) {
		Optional<Employee> op = employeeRepository.findById(emp.getId());
		if(op.isPresent()) {
			return "Employee id must be unique";
		}else {
				employeeRepository.save(emp);				// insert new records
				return "Record stored successfully";
		}
	}
	
	public String updateEmployeeSalary(Employee emp) {
		Optional<Employee> op = employeeRepository.findById(emp.getId());
		if(op.isPresent()) {
				 	Employee e	= op.get();
				 	e.setSalary(emp.getSalary());
				 	employeeRepository.saveAndFlush(e);			// update 	existing record update property 
				 	return "Record updated successfully";
		}else {
				
				return "Record not present";
		}
	}
	
	public String deleteEmployee(int id) {
		Optional<Employee> op = employeeRepository.findById(id);
		if(op.isPresent()) {
						Employee e = op.get();
						employeeRepository.delete(e);
			return "Employee deleted successfully";
		}else {
				return "Record not present";
		}
	}
	
	public String findEmployee(int id) {
		Optional<Employee> op = employeeRepository.findById(id);
		if(op.isPresent()) {
			Employee e = op.get();
			return e.toString();
		}else {
			return "Record not present";
		}
	}
	
	/*public Employee findEmployeeById(int id) {
		Optional<Employee> op = employeeRepository.findById(id);
		if(op.isPresent()) {
			Employee e = op.get();
			return e;
		}else {
			return null;
		}
	}*/
}

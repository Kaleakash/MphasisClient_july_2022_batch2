package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.service.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {
	@Test
	void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		boolean res = es.checkUser("Raj", "123");
		assertTrue(res);
	}
	@Test
	void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployee();
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}
	@Test
	void testGetAllEmployees() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		List<Employee> listOfemp  = es.getAllEmployees();
		assertEquals(3, listOfemp.size());
	}

}

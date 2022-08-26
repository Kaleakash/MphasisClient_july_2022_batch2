package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {

	@Test
	@DisplayName("Check User details testing")
	void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		String result = es.checkUser("raj@gmail.com", "123");
		assertEquals("success", result);	
		String result1 = es.checkUser("ram@gmail.com", "123");
		assertEquals("failure", result1);
	}
	@Test
	@Disabled
	void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployee();
		assertNotNull(emp);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}
	@Test
	void testListOfEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.listOfEmployee();
		assertEquals(2, listOfEmp.size());
	}
	@Test
	void testPassEmployeeObject() {
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		float updatedSalary =es.passEmployeeObject(emp);
		assertEquals(12500, updatedSalary);
	}

}

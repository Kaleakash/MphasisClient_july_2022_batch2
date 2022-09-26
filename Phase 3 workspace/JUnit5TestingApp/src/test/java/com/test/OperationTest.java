package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.Operation;

class OperationTest {
	
	@Test						// it is like a main method 
	void testAdd() {
		
		try {
		Operation op = new Operation();
		int result = op.add(10, 20);
		assertEquals(30, result);
		}catch (Error e) {
			System.out.println("Test Add Error generated");
		}
	}
	@Test						// it is like a main method 
	void testSub() {
		Operation op = new Operation();
		int result = op.sub(100, 50);
		assertEquals(50, result);
	}
	@Test						// it is like a main method 
	void testMul() {
		Operation op = new Operation();
		int result = op.mul(100, 50);
		assertEquals(5000, result);
	}
	@Test						// it is like a main method 
	void testDiv() {
		Operation op = new Operation();
		int result = op.div(100, 50);
		assertEquals(2, result);
	}
}

package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AllHookMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All test method");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All test method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test method");
	}

	@Test
	void test1() {
		System.out.println("while testing 1 method");
	}

	@Test
	void test2() {
		System.out.println("while testing 2 method");
	}
}


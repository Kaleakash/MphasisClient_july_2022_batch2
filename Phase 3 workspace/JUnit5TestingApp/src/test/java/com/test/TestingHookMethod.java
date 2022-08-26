package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingHookMethod {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("it will call before all testing only once");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("it will call after all testing only once");
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("it will call before each test function again and again");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("it will call after each test function again and again");
	}

	@Test
	void test1() {
		System.out.println("while test1 function testing");
	}
	@Test
	void test2() {
		System.out.println("while test2 function testing");
	}
}

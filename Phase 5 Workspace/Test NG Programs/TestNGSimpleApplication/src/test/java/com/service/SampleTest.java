package com.service;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	  @Test
	  public void f1() {
		  System.out.println("while testing 1st method - second class");
	  }
	  @Test
	  public void f2() {
		  System.out.println("while testing 2nd method - second class");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before method");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After method");
	  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before class");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("After class");
	  }
}

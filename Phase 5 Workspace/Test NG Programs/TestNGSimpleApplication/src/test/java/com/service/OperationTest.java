package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OperationTest {
  @Test
  @Ignore				// @Disable annotation in jUnit 
  public void addTest() {
	  Operation op = new Operation();
	  int result = op.add(100, 200);
	  assertEquals(result, 300);
  }
  @Test
  public void subTest() {
	  Operation op = new Operation();
	  int result = op.sub(100, 200);
	  assertEquals(result, -100);
  }
  @Test
  public void mulTest() {
	  Operation op = new Operation();
	  int result = op.mul(10, 2);
	  assertEquals(result, 20);
  }
  
  @Test
  public void divTest() {
	  Operation op = new Operation();
	  int result = op.div(200, 100);
	  assertEquals(result, 2);
  }
}

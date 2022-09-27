package com.service;

import org.testng.annotations.Test;

public class BikeTest {
  @Test(groups = {"speed"})
  public void speed() {
	  System.out.println("bike speed testing");
  }
  
  
  @Test(groups = {"mailage"})
  public void mailge() {
	  System.out.println("bike mailge testing");
  }
  @Test
  public void color() {
	  System.out.println("bike color testing");
  }
}

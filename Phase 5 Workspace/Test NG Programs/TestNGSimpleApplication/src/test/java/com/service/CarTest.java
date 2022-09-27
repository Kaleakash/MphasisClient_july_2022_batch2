package com.service;

import org.testng.annotations.Test;

public class CarTest {
	 @Test(groups = {"speed"})
	  public void speed() {
		  System.out.println("car speed testing");
	  }
	  
	  @Test(groups = {"mailage","speed"})
	  public void mailge() {
		  System.out.println("car mailge testing");
	  }
	  @Test
	  public void color() {
		  System.out.println("car color testing");
	  }
}

package com.service;

import org.testng.annotations.Test;

public class OrderTestExecution {
  @Test(priority = 3)
  public void b() {
	  System.out.println("b testing function");
  }
  
  @Test(priority = 2)
  public void a() {
	  System.out.println("a testing function");
  }
  
  @Test(priority = 4)
  public void c() {
	  System.out.println("c testing function");
  }
  

  @Test(priority = 1)
  public void e() {
	  System.out.println("e testing function");
  }
  
  @Test(priority = 1)
  public void d() {
	  System.out.println("d testing function");
  }
  
}

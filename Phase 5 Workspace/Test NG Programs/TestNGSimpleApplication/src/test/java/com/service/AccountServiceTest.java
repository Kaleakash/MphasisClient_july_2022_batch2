package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.bean.Account;

public class AccountServiceTest {

  @Test
  public void createAccountTest() {
    AccountService ac = new AccountService();
    Account acc1 = new Account(100,"Ravi",400);
    String result1 = ac.createAccount(acc1);
    assertEquals(result1, "Min amount must be 500");		// it will not call dao method 	
   
    Account acc2 = new Account(100,"Ravi",700);
    String result2 = ac.createAccount(acc2);
    assertEquals(result2, "Account created");
   
    Account acc3 = new Account(100,"Mahesh",10000);
    String result3 = ac.createAccount(acc3);
    assertEquals(result3, "Account didn't create");
  }

  @Test
  @Ignore
  public void depositTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  @Ignore
  public void findBalanceTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  @Ignore
  public void withdrawnTest() {
    throw new RuntimeException("Test not implemented");
  }
}

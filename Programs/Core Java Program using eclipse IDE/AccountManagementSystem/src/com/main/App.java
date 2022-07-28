package com.main;

import com.bean.Account;
import com.service.AccountService;

public class App {

	public static void main(String[] args) {
		AccountService as = new AccountService();
		Account acc = new Account();
		acc.setAccno(1);
		acc.setName("Raj");
		acc.setAmount(500);
		String result = as.createAccount(acc);
		System.out.println(result);
		
		Account acc1 = new Account();
		acc1.setAccno(2);
		acc1.setName("Ravi");
		acc1.setAmount(700);
		String result1 = as.createAccount(acc1);
		System.out.println(result1);
		
		Account searchAccountDetails	 = as.findAccount(3);
		if(searchAccountDetails==null) {
			System.out.println("Account details not present");
		}else {
			System.out.println(searchAccountDetails);    // toString method 
		}
	}

}

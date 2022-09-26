package com.service;

import com.bean.Account;

public class AccountService {
	
	public String createAccount(Account account) {
		/*
		 * We will DAO method and that method call db to create the account
		 * 
		 */
		if(account.getAmount()<500) {
			return "Min amount must be 500";
		}else {
			return "Account created";
		}
	}
	
	public String findBalance(int accno) {
		/*
		 * 
		 * 
		 * 
		 */
		//return "Your account balance is 5000";
		return "Account number doesn't exist";
	}
	public String withdrawn(Account account) {
		/*
		 * 
		 * 
		 */
		//return "Withdraw successfully";
		return "You can't withdraw";
	}
	public String deposit(Account account) {
		/*
		 * 
		 * 
		 */
		//return "Deposited successfully";
		return "You can't deposit";
	}
}

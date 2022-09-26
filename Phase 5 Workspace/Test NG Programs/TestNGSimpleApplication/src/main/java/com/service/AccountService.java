package com.service;

import com.bean.Account;
import com.dao.AccountDao;

public class AccountService {
	AccountDao ad = new AccountDao();
	public String createAccount(Account account) {
		
		if(account.getAmount()<500) {
			return "Min amount must be 500";
		}else if(ad.createAccount(account)>0){
			return "Account created";
		}else {
			return "Account didn't create";
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

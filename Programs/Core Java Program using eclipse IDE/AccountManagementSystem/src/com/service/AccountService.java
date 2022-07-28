package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Account;

public class AccountService {
			List<Account> listOfAccount  = new ArrayList<Account>();
		
			public String createAccount(Account account) {
				int flag=0;
				if(listOfAccount.size()==0) {
				listOfAccount.add(account);
				return "Account created";
				}else {
					Iterator<Account> li = listOfAccount.iterator();
					while(li.hasNext()) {
						Account acc = li.next();
						if(acc.getAccno()==account.getAccno()) {
							flag++;
							break;
						}
					}
				}
				if(flag>0) {
					flag=0;
					return "Account number must be unique";
				}else {
					listOfAccount.add(account);
					return "Account created";
				}
				
			}
			
			public Account findAccount(int accno) {
				Iterator<Account> li = listOfAccount.iterator();
				while(li.hasNext()) {
					Account acc = li.next();
					if(acc.getAccno()==accno) {
						return acc;
					}
				}
				return null;
			}
			
			public float findAccountBalance(int accno) {
				Iterator<Account> li = listOfAccount.iterator();
				while(li.hasNext()) {
					Account acc = li.next();
					if(acc.getAccno()==accno) {
						return acc.getAmount();
					}
				}
				return -1;
			}
			
			public List<Account> getAllAccount() {
				return listOfAccount;
			}
}




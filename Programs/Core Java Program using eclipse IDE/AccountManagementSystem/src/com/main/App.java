package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Account;
import com.service.AccountService;

public class App {

	public static void main(String[] args) {
//		AccountService as = new AccountService();
//		Account acc = new Account();
//		acc.setAccno(1);
//		acc.setName("Raj");
//		acc.setAmount(500);
//		String result = as.createAccount(acc);
//		System.out.println(result);
//		
//		Account acc1 = new Account();
//		acc1.setAccno(2);
//		acc1.setName("Ravi");
//		acc1.setAmount(700);
//		String result1 = as.createAccount(acc1);
//		System.out.println(result1);
//		
//		Account searchAccountDetails	 = as.findAccount(3);
//		if(searchAccountDetails==null) {
//			System.out.println("Account details not present");
//		}else {
//			System.out.println(searchAccountDetails);    // toString method 
//		}
		AccountService as = new AccountService();
		Scanner sc = new Scanner(System.in);
		int accno;
		String name;
		float amount;
		String result,con;
		do {
			System.out.println("1: Create Account, 2: Account Details 3: Account Balance, 4: Withdraw 5: Deposite 6 : FindAll account");
			System.out.println("Enter your choice");
			int key = sc.nextInt();
			
			  switch (key) {
			case 1: System.out.println("enter the account number ");
						accno = sc.nextInt();
						System.out.println("Enter the name");
						name = sc.next();
						System.out.println("Enter the amount");
						amount = sc.nextFloat();
						Account ac = new Account(accno, name, amount);
						result = as.createAccount(ac);
						System.out.println(result);
				break;
			case 2 : System.out.println("Enter the account number");
						accno = sc.nextInt();
			          Account searchAccount = as.findAccount(accno);
			          if(searchAccount==null) {
			        	  System.out.println("Account number not present");
			          }else {
			        	  	System.out.println(searchAccount);
			          }
			          break;
			case 3 : System.out.println("Enter the account number");
						accno = sc.nextInt();
						float balanceAmount = as.findAccountBalance(accno);
						if(balanceAmount<0) {
								System.out.println("Account not present");
						}else {
							System.out.println("Your balance amount is "+balanceAmount);
						}
						break;
			case 4 : System.out.println("Enter the account number");
			            accno = sc.nextInt();
			            System.out.println("Enter the amount to withdraw");
			            amount = sc.nextFloat();
			            Account ac1 = new Account();
			            ac1.setAccno(accno);
			            ac1.setAmount(amount);
			            result = as.withdraw(ac1);
			            System.out.println(result);
			            break;
			case 5 : System.out.println("Enter the account number");
            			accno = sc.nextInt();
            			System.out.println("Enter the amount to deposite");
            			amount = sc.nextFloat();
            			Account ac2 = new Account();
            			ac2.setAccno(accno);
            			ac2.setAmount(amount);
            			result = as.deposite(ac2);
            			System.out.println(result);
            			break;
			case 6 : List<Account> listOfAccount = as.getAllAccount();
			            Iterator<Account> li = listOfAccount.iterator();
			            while(li.hasNext()) {
			            	Account a = li.next();
			            	System.out.println(a);
			            }
			default:		System.out.println("Wrong choice");
				break;
			}
			  System.out.println("Do you want to continue?");
			  con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		
		System.out.println("Thank you ! Visit Again");
	}

}

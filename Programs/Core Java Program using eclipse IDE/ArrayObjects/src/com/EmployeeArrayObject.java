package com;

import java.util.Scanner;

public class EmployeeArrayObject {

	public static void main(String[] args) {
		//Employee employees[]=new Employee[100];
		
		Scanner obj = new Scanner(System.in);
		System.out.println("how many record do you want to store");
		int n = obj.nextInt();
		Employee employees[]=new Employee[n];
		System.out.println("Enter the record one by one");
		for(int i=0;i<n;i++) {
			employees[i]=new Employee();
			System.out.println("Enter the id");
			int id = obj.nextInt();
			employees[i].setId(id);
			System.out.println("Enter the name");
			String name = obj.next();
			employees[i].setName(name);
			System.out.println("Enter the salary");
			float salary = obj.nextFloat();
			employees[i].setSalary(salary);
		}
		// business logic on those data. 
		System.out.println("All Emloyee details are");
		for(Employee e : employees) {
			System.out.println(e);				// toString() method
		}
	}

}

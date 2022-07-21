package xyz;

import abc.Employee;

public class Manager extends Employee{

	public void disMgr() {
		//System.out.println("a "+a);			// private 
		//System.out.println("b "+b);				// default 
		System.out.println("c "+c);
		System.out.println("d "+d);
	}
}

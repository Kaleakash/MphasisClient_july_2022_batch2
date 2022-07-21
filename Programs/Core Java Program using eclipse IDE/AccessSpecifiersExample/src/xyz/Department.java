package xyz;

import abc.Employee;

public class Department {
		Employee emp = new Employee();
		public void dispDeptInfo() {
			//System.out.println(" a "+emp.a);		// private
			//System.out.println(" b "+emp.b);		// default 
			//System.out.println(" c "+emp.c);		// protected 
			System.out.println(" d "+emp.d);		// only public 
		}
}

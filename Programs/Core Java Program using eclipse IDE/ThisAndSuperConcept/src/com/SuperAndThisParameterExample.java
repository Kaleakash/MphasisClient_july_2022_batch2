package com;
class Employee {
				int id;
				String name;
				float salary;
				public Employee() {
						this.id  =123;
						this.name = "Unknown";
						this.salary = 8000;
				}
				public Employee(int id) {
					this();						// calling empty constructor using this()
					this.id = id;
				}
				public Employee(int id, String name) {
					this(id);						// calling constructor with id a parameter 
					this.name = name;
				}
				public Employee(int id, String name, float salary) {
					this(id,name);
					this.salary = salary;
				}
				void dis() {
					System.out.println(" id is "+id);
					System.out.println("name is "+name);
					System.out.println("salary is "+salary);
				}
}
class Manager extends Employee {
	int numberOfEmp;
	public Manager(int id, String name, float salary, int numberOfEmp) {
		// super();					// it will call super class empty constructor 
		super(id,name,salary);		// it wll call super class parameter constructor with parameter  it will call line number 19 
		this.numberOfEmp = numberOfEmp;
	}
	void disMgr() {
		System.out.println("Number of employee working under him  "+numberOfEmp);
	}
}
public class SuperAndThisParameterExample {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();								emp1.dis();
//		Employee emp2 = new Employee(1);								emp2.dis();
//		Employee emp3 = new Employee(2,"Ravi");					emp3.dis();
//		Employee emp4 = new Employee(3, "Ajay", 14000); 	emp4.dis();
		Manager mgr1 = new Manager(100, "Mahesh", 45000, 10);
		mgr1.dis();
		mgr1.disMgr();
	}

}

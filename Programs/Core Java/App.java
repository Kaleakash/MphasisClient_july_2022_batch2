import java.util.*;
class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner sc = new Scanner(System.in);
	Address add = new Address();
	public void readEmp() {
			System.out.println("Enter the id");
			id = sc.nextInt();
			System.out.println("Enter the name");
			name = sc.next();
			System.out.println("Enter the salary");
			salary = sc.nextFloat();
	}
	public void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class Manager extends Employee {
	int numberOfEmp;
	public void readMgr() {
		readEmp();
		System.out.println("Enter the number of employee working under him");
		numberOfEmp = sc.nextInt();
		add.readAdd();
	}
	public void disMgr() {
		disEmp();
		System.out.println("Number of emp working "+numberOfEmp);
		add.disAdd();
	}	
}
class Address {
	private String city;
	private String state;
	Scanner ss = new Scanner(System.in);
	public void readAdd() {
		System.out.println("Enter the city");
		city = ss.next();
		System.out.println("Enter the state");
		state = ss.next();
	}
	public void disAdd() {
		System.out.println("city is "+city);
		System.out.println("state is "+state);
	}
}
class App {
	public static void main(String args[]) {
	Manager mgr = new Manager();
	//mgr.readEmp();	
		mgr.readMgr();
	//mgr.disEmp();
	mgr.disMgr();
	}
}
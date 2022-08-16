package com;

public class Employee {
private int id;
private String name;
private float salary;
	
	public Employee() {
		super();
		System.out.println("Object created - using empty constructor");
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

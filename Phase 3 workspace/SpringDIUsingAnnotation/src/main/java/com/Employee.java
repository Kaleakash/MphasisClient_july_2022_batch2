package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component					// <bean class="com.Employee"></bean> id name is employee 
public class Employee {
private int id;
private String name;
private float salary;
@Autowired
private Address add;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}

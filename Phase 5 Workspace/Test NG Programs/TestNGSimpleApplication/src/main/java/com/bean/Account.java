package com.bean;
public class Account {
private int accno;
private String name;
private float amount;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accno, String name, float amount) {
	super();
	this.accno = accno;
	this.name = name;
	this.amount = amount;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "Account [accno=" + accno + ", name=" + name + ", amount=" + amount + "]";
}

}

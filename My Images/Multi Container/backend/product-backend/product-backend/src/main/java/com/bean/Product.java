package com.bean;

public class Product {
private int pid;
private String pname;
private float price;
private String url;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", url=" + url + "]";
}
public Product(int pid, String pname, float price, String url) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.url = url;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}

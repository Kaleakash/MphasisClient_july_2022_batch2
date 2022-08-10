package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)				// it will generate id automatically 
private int cid;
private String cname;
private float fees;
@OneToMany
@JoinColumn(name = "csid")
private List<Students> listOfStd;

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}
public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + ", listOfStd=" + listOfStd + "]";
}


}

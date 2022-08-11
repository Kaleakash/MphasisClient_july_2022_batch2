package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Students {
@Id
private int sid;
private String sname;
private int age;

private Integer tsid;						//it can allow null value 
private Integer csid;

public Integer getCsid() {
	return csid;
}
public void setCsid(Integer csid) {
	this.csid = csid;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public Integer getTsid() {
	return tsid;
}
public void setTsid(Integer tsid) {
	this.tsid = tsid;
}
@Override
public String toString() {
	return "Students [sid=" + sid + ", sname=" + sname + ", age=" + age + ", tsid=" + tsid + ", csid=" + csid + "]";
}


}

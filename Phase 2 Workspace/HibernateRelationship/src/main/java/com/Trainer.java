package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
@Id
private int tid;
private String tname;
@OneToOne
private Course course;			// one trainer can handle one course 
@OneToMany
@JoinColumn(name = "tsid")				//tsid is fk in Student table 
private List<Students> listOfStd;		// one trainer can handle more than student 
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", course=" + course + ", listOfStd=" + listOfStd + "]";
}

}

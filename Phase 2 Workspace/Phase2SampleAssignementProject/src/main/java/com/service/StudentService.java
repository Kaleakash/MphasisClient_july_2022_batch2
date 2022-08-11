package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {

	StudentDao sd = new StudentDao();
	
	public String storeStudentDetails(Student student) {
		if(sd.storeStudent(student)>0) {
			return "Student details stored successfully";
		}else {
			return "Student details didn't store";
		}
	}
	
	public List<Student> findAllStudent() {
		return sd.findAllStudent();
	}
}



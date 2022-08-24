package com.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication					
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.out.println("ready...");
		//BeanFactory 
		// ApplicationContext 
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com.bean");
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		emp.setId(100);
		emp.setName("Raju");
		emp.setSalary(12000);
		System.out.println(emp);
	}

}

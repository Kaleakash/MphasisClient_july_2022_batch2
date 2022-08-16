package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		
		//Employee emp1 = new Employee();
		//emp1.display();

		Resource rs = new ClassPathResource("beans.xml");  // loadin the xml file
		BeanFactory bb = new XmlBeanFactory(rs);	// getting BeanFactory interface reference. 
//		Employee employee1 = (Employee)bb.getBean("emp1");		// type casting 
//		employee1.display();
//		
//		Employee employee3 = (Employee)bb.getBean("emp1");		// type casting 
//		employee3.display();
		
//		Employee employee2 = (Employee)bb.getBean("emp2");
//		employee2.display();
//		
//		Employee employee4 = (Employee)bb.getBean("emp2");		// type casting 
//		employee4.display();
		
		Employee employee5 = (Employee)bb.getBean("emp1");
		System.out.println(employee5);                    // it will call toString method 
		
		Employee employee6 = (Employee)bb.getBean("emp3");		// DI using parameterized constructor
		System.out.println(employee6);						       
		
	}

}

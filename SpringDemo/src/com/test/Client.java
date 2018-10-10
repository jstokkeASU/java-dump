package com.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		Employee eRef = new Employee();
		eRef.setId(5150);
		eRef.setName("Pete Maxwell");
		eRef.setAddress("100 Main St, Vancouver, WA 98660");
		
		System.out.println("Employee:"+eRef);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		((ConfigurableApplicationContext)context).close();
		
		System.out.println("Employee 1: "+e1);
		System.out.println("Employee 2: "+e2);
		//System.out.println("Employee 2:"+e2);
		
	}

}

package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Client {
	
	public Client(){
		System.out.println("client contructor");
	}
	
	public static void main(String a[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-annotation.xml");
		
		Emp1 e = (Emp1) context.getBean("emp1");
		
		System.out.println(e.getName());
		
		System.out.println(e.getAddress());
		
		System.out.println(e.getPayment());
		
		System.out.println(e.getCompany());
		
		
		System.out.println(Emp1.getContext());
	
	}

	
}

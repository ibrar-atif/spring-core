package com.feb28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String a[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		Emp1 e = (Emp1) context.getBean("emp1");
		
		System.out.println(e.getName());
		
		System.out.println(e.getAddress());
		
		System.out.println(e.getCompany());
		
		OuterBean out = (OuterBean) context.getBean("outer");
		
		System.out.println(out.getInnerBean());
	}

	
}

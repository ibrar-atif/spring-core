package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String a[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigDef.class);
		
		Employee e = (Employee) context.getBean("emp");
		
		System.out.println(e.getAddress());
	}
}

package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.emp.Employee;

public class AppClient {
	
	public static void main(String aa[]){
		//ApplicationContext context = new ClassPathXmlApplicationContext(
		//		"beans.xml");
		
		BeanFactory beanf = new XmlBeanFactory (new ClassPathResource("beans.xml"));
		//Employee emp = (Employee) context.getBean("firstBean");
		
		
		
		
	}

}

package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.emp.Employee;

public class AppClient {
	
	public static void main(String aa[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		
		//BeanFactory beanf = new XmlBeanFactory (new ClassPathResource("beans.xml"));
		//Employee emp = (Employee) beanf.getBean("emp");
		
		/*Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.getAddress());
		System.out.println(emp.getBeanName());
		
		System.out.println(emp.getType());
		*/
		
		
		
	}

}

package com.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.emp.DemoClass;


public class AppClient {
	
	public static void main(String aa[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		
		//BeanFactory beanf = new XmlBeanFactory (new ClassPathResource("beans.xml"));
		//Employee emp = (Employee) beanf.getBean("emp");
		
		DemoClass demo = (DemoClass) context.getBean("demoClass");
		System.out.println(demo.getName());
	
		
		
		
	}

}

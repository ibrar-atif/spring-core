package com.cycle;

import java.applet.AppletContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.emp.Account;
import com.emp.Employee;

public class LifeCycle implements BeanNameAware, ApplicationContextAware , InitializingBean, BeanPostProcessor, DisposableBean{

	private static ApplicationContext context;
	public LifeCycle(){
		System.out.println("constructor Life Cycle");
	}
	
	@Autowired
	//@Qualifier("savingAccount")
	private Account savingAccount;


	
	/*public void setEmployee(Employee employee) {
		System.out.println("Dependencies Injected");
		this.employee = employee;
	}*/

	public void setBeanName(String arg0) {
		System.out.println("name "+arg0);
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		System.out.println(" context bean");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing bean");
		
	}
	
	
	public void postProcessor(){
		
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("");
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() throws Exception {
		System.out.println("before destroy");
		
	}
	
	
	
	
}

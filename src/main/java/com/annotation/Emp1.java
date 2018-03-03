package com.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Emp1 implements BeanNameAware , ApplicationContextAware,InitializingBean,DisposableBean{
	

	private static ApplicationContext context;
	
	public static ApplicationContext  getContext(){
		return context;
	}
	@Value("Srini")
	private String name;
	
	@Autowired
	private Add1 address;
	
	private Company company;
	
	@Autowired
	private Payment creditCard;
	
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Add1 getAddress() {
		return address;
	}
	
//	/@Autowired
	public void setAddress(Add1 address) {
		System.out.println("Setting All Injection");
		this.address = address;
	}
	
	public Emp1(){
		System.out.println("Employee created Instantiation");
	}
	public Payment getPayment() {
		return creditCard;
	}
	public void setPayment(Payment payment) {
		this.creditCard = payment;
	}
	public void setBeanName(String arg0) {
		System.out.println("Bean name callback "+arg0);
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("application context aware "+applicationContext);
		context = applicationContext;
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("i can initialize anything");
		
	}
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	
	
	public void post(){
		
	}
	

}

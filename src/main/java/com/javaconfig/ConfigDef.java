package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.javaconfig")
public class ConfigDef {

	@Autowired
	Address address;
	
	
	@Bean(name="emp")
	public Employee getEmployee(){
		
		Employee emp =  new Employee();
		return emp;
	}
	
	@Bean(name="address")
	public Address getAddress(){
		return new Address();
	}
	
	
	
	/*@Bean(name="address")
	public Address getAddress(){
		return new Address();
	}*/
}

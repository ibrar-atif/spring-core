package com.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoClass")
public class DemoClass {
	
	@Value("${myname}")
	String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public DemoClass(){
		System.out.println("demo");
	}
}

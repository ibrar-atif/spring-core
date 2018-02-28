package com.annotation;

import org.springframework.stereotype.Component;

@Component("com")
public class Company {

	public Company(){
		System.out.println("company");
	}
}

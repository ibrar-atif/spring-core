package com.emp;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount extends Account{
	
	public CurrentAccount(){
		System.out.println("current");
	}

}

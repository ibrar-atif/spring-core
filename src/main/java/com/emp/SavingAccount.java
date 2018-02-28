package com.emp;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount extends Account{
	
	public SavingAccount(){
		System.out.println("saving");
	}

}

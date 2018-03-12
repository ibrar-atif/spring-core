package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	
	@Autowired
	public Employee(Address address){
		this.address = address;
		System.out.println("Java Config Employee");
	}
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

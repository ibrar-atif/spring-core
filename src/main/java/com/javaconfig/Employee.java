package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	public Employee(){
		
	}
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

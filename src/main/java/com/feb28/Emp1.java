package com.feb28;

public class Emp1 {
	
	private String name;
	private Add1 address;
	private Company company;
	
	
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
	public void setAddress(Add1 address) {
		this.address = address;
	}
	
	public Emp1(){
		System.out.println("Employee created");
	}

}

package com.ssi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private int code;
	private String cname;
	private String email;
	
	@Autowired
	private Company company;
	
	@Autowired
	@Qualifier("card2")
	private Card card;
		
	@Autowired
	private Address address;
	
	
	@PostConstruct
	public void start(){
		System.out.println("Starting Customer");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying Customer");
	}
	
	
	
	
	public Customer() {
		super();
	}
	

	public Customer(int code, String cname) {
		super();
		this.code = code;
		this.cname = cname;
	}


	public Customer(String cname, String email) {
		super();
		this.cname = cname;
		this.email = email;
	}


	public Customer(int code, String cname, String email, Address address) {
		super();
		this.code = code;
		this.cname = cname;
		this.email = email;
		this.address = address;
	}

	public void showInfo(){
		System.out.println("Code  : "+code);
		System.out.println("Name  : "+cname);
		System.out.println("Mail  : "+email);
		System.out.println("Adrs  : "+address);
		System.out.println("Card  : "+card);
		System.out.println("Cmp   : "+company);
		System.out.println("_______________________________________________");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

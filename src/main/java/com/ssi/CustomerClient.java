package com.ssi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer c1=context.getBean("customer1",Customer.class);
		c1.showInfo();
		context.registerShutdownHook();
	}

}

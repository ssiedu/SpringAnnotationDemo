package com.ssi;

import org.springframework.stereotype.Component;

@Component
public class Company {
	private String companyCode;
	private String cname;
	public Company() {
		companyCode = "C111";
		cname = "SSI";
	}
	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", cname=" + cname + "]";
	}
	
	
}

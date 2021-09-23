package com.app.ClassDesignPattern;

public class PhoneBuilderMain {

	
	private String os;
	private String name;
	private double version;
	
	public PhoneBuilderMain setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilderMain setName(String name) {
		this.name= name;
		return this;
	}
	public PhoneBuilderMain setVersion(double version) {
		this.version = version;
		return this;
	}
	
	
	public PhoneBuilder getPhoneBuilder()
	{
		return new PhoneBuilder(os, name, version);
	}
}

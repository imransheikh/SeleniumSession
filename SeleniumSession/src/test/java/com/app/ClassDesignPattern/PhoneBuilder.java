package com.app.ClassDesignPattern;

public class PhoneBuilder {
	
	private String os;
	private String Name;
	private double version;
	
	public PhoneBuilder(String os, String name, double version) {
		super();
		this.os = os;
		this.Name = name;
		this.version = version;
	}

	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", Name=" + Name + ", version="
				+ version + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

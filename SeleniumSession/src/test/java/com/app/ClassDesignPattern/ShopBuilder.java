package com.app.ClassDesignPattern;

public class ShopBuilder {

	
	public static void main(String[] args) {
		/*PhoneBuilder obj= new PhoneBuilder("Android", "Samsung", 5.1);
		System.out.println("Full phone information: " + obj.toString());*/
		
		PhoneBuilderMain obj= new PhoneBuilderMain().setOs("IOS");
		
		PhoneBuilder p= obj.getPhoneBuilder();
		
		System.out.println("My all information is: " + p);
		
			
		
	}
}

package com.app.seleniumsession;

import java.util.ArrayList;
import java.util.List;

public class companyClass {
	
	
	String compName;
	String contact;
	String county;
	public companyClass(String compName, String contact, String country)
	{
		this.compName= compName;
		this.contact= contact;
		this.county= country;
		
	}
	
	
	public static void main(String[] args) {
	/*	companyClass country1= new companyClass("Alfreds Futterkiste", "Maria Anders", "Germany");
		companyClass country2= new companyClass("Centro comercial Moctezuma", "Francisco Chang", "Mexico");
		
		
		List<companyClass> countryList= new ArrayList<companyClass>();
		countryList.add(country1);
		countryList.add(country2);
		
		System.out.println("Company" + "    " + "Contact" + "    " + "Country");
		for(companyClass c: countryList)
		{
			System.out.println(c.compName +  "  " + c.contact +   c.county );
		}
		*/
	/*	System.out.println("Company" + "    " + "Contact" + "    " + "Country");
		for(companyClass c: countryList)
		{
			System.out.println(c.compName +  "  " + c.contact +   c.county );
		}
		*/
		companyTestScript obj= new companyTestScript();
		List<companyClass> countryListGet= new ArrayList<companyClass>();
		//countryListGet= obj.getListOfCompany();
		
		
		System.out.println("Company" + "    " + "Contact" + "    " + "Country");
		for(companyClass c: countryListGet)
		{
			System.out.println(c.compName +  "  " + c.contact +   c.county );
		}
		
		System.out.println("=========================================");
	}
	
	
	
	

}

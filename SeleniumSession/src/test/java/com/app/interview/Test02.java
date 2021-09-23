package com.app.interview;

import java.util.ArrayList;
import java.util.List;



public class Test02 {
	
	
	
	public void listMethod()
	{
		List<String> name= new ArrayList<>();
		name.add("Imran");
		name.add("Test");
		
		
		System.out.println(name);
		List<String> testName= new ArrayList<>();
		
		for (int i=0; i<name.size(); i++)
		{
			System.out.println(name.get(i));
			
		}
		for(String na: name)
		{
			//System.out.println(na);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Test02 obj= new Test02();
		obj.listMethod();
	}

}

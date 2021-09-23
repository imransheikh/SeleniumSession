package com.app.ArrayInterview;

import java.util.ArrayList;

public class TestClass {

	
	public void test()
	{
		String str= new String("Hello");
		String str1="Hello";
		String str2= str;
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str.equals(str2));
	}
	
	public void test2()
	{
		String str1="Hello worldl";
		int i= str1.indexOf('o');
		int j= str1.lastIndexOf('l');
		System.out.println(i + " " + j);
		
		StringBuffer sb= new StringBuffer("Hello Imran");
		sb.deleteCharAt(6);
		System.out.println(sb);
		
	}
	
	public void test3()
	{
		int []a= {1,2,3,4,5};
		int []b=a;
		int sum=0;
		for(int i=0; i<3; ++i)
		{
			System.out.println(i);
			sum+= (a[i]*b[i+1])+ (a[i+1]*b[i]);
			System.out.println(sum);
		}
		//1*2+2*1
		//2*3+3*2 =12+4= 16
		//3*4+4*3 =24+16= 40
		System.out.println(sum);
	}
	
	
	public void test4()
	{
		ArrayList<Integer> list= new ArrayList<Integer>(9);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(4);
		//list.trimToSize();
		for(Integer i: list)
		{
			System.out.println(i);
		}
	}
	
	
	public void test5()
	{
		
		for(;;)
			System.out.println("imran");
	}
	
	
	public void test6()
	{
		
		boolean result= true;
				while(result)
				result = false;
				if(result)
				System.out.println("test1");
				if(result=true)
					System.out.println("test2");
				else
					System.out.println("test3");

	}
	
	
	
	public int test7()
	{
		
		//Important questions
			String fruit= new String("Banana");
					int cost; 
			
			if(fruit=="Banana")
				return cost= 20;
			if(fruit=="cherry")
			return cost= 15;	
			if(fruit=="apple")
			return cost= 15;
			
			else
				return cost=0;

	}
	
	
	public void test8()
	{
		String str = new String("Welcome to geeksforgeeks"); 
		str= str.substring(12,16);
		System.out.println("String is : " + str);
	}
	
	public void test9()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("===================");
		for(int i=0; i<3; ++i)
		{
			System.out.println(i);
		}
	}
	
	
	public void test10()
	{
		 try  
	        {  
	        int data=50/0; //may throw exception  
	        System.out.println("rest of the code 1"); 
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	            System.out.println("rest of the code 2"); 
	        }  
	        
	    }  
	

	
	
	public void test18()
	{
		for(int i=0; i<3; ++i)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		TestClass obj= new TestClass();
		obj.test18();
		//obj.test10();
		//obj.test();
		//obj.test2();
		//obj.test3();
		//obj.test4();
		//obj.test5();
		//obj.test6();
		//int k= obj.test7();
		//System.out.println("Cost is: " + k);
		//obj.test8();
		//obj.test9();
		//System.out.println("String arguments passed while running this Java Program : ");
	/*	for (String argument : args) {
			System.out.println(argument);
		}*/
		

		 
	}
}

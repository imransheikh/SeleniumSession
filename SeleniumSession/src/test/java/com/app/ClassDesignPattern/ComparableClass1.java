package com.app.ClassDesignPattern;

public class ComparableClass1 implements Comparable<ComparableClass1> {
	
	
	int age ; 
	int rollNo;
	String name;
	
	public ComparableClass1(int age, int rollNo, String name)
	{
		this.age= age;
		this.rollNo= rollNo;
		this.name= name;
	}
	
		
	public void printDetails()
	{
		System.out.println(this.age + " : " +  this.rollNo + " : " + this.name);
	}


	@Override
	public int compareTo(ComparableClass1 obj1) {
		
		//return this.name.compareTo(obj1.name);
		
		if (this.age == obj1.age)
			return 0;
		else if (this.age > obj1.age)
			return 1;
		else
			return -1;
		 
	}
	
	
	
	
	
	

}

package com.app.collectionInterviewQuestions;

public class ObjectClassTest {
	
	public String name= "imran";
	
	public void testMethod()
	{
		System.out.println("Test Method...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("I am overridden to string method...");
		return "testToString";
	}

	
	
	public static void main(String[] args) {
		
		Object obj=new Object();
		System.out.println(obj.getClass());
		//Object obj= new ObjectClassTest();
		//String s= obj.toString();
		//System.out.println(s);
		ObjectClassTest ob= (ObjectClassTest) obj;
		ob.testMethod();
		//System.out.print();
		
	}
}

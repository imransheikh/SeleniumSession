package com.app.practice;

 class TestClassB extends TestClassA {

	
	
	int a = 30;
	int b = 40;
	
	public TestClassB ()
	{
		System.out.println(" Con B");
	}

	public void M1() {
		System.out.println("BM1");
	}

	public void M3() {
		System.out.println("BM3");
	}
	
	
	
	public static void main(String[] args) {
		

 
		  TestClassA obj2= new TestClassB();
		  System.out.println(obj2.a);
			System.out.println(obj2.b);
			obj2.M1();
			obj2.M2();
			//obj2.M3();

			/*
			 * 
			 * 
			 * 
			 * TestClassB obj= new TestClassB(); System.out.println(obj.a);
			 * System.out.println(obj.b); obj.M1(); obj.M2(); obj.M3();
			 * 
			 * 
			 * TestClassA obj1= new TestClassA(); System.out.println(obj1.a);
			 * System.out.println(obj1.b); obj1.M1(); obj1.M2(); //obj.M3();
			 * 
			 * 
			 */
	}

}

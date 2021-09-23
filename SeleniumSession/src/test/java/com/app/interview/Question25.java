package com.app.interview;

import org.junit.internal.runners.TestMethod;

class test {

	public static void testMethod1() {
		try {
			 testMethod2();
		} catch (ArithmeticException ae) {
			System.out.println("XYZ Test");
		}
	}

	
	public static void testMethod2() throws ArithmeticException {
		try {
			 testMethod3();
		} catch (ArithmeticException ae) {
			System.out.println("ABC Test");
		}
	}
	
	
	public static void testMethod3() throws ArithmeticException {
		throw new ArithmeticException();
	}
	
}

public class Question25 {

	public static void main(String[] args) {
		
		test obj= new test();
		obj.testMethod1();
	}
}

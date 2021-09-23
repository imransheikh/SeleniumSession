package com.app.interview;

public class Question23 {
	
	static int thrower() throws Exception
	{
		return 42;
	}
	
	public static void main(String[] args) {
		
		int x=0;
		try {
			 x= thrower();
		}
		catch (Exception e) {
			x++;
		}
		
		finally {
			System.out.println("x = " + ++x);
		}
	}

}

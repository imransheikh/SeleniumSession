package com.app.practice;

class ConstructorClassTest {
	
	
	int i;
	String name;
	boolean result;
	static String test= "Test";
	
	
	

	public ConstructorClassTest(int i) {
		i = 2;
		name = "Mohd";
		result = true;

	}
	 
	
			
			public void displayVariables() {
				System.out.println(i);
				System.out.println(name);
				System.out.println(result);
				
				
				
			}
			 
	
	
	
	
	
	public static void main(String[] args) {
		
		ConstructorClassTest obj= new ConstructorClassTest(2);
		
		
		obj.displayVariables();
	}

}

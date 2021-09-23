package com.app.stringTest;

public class EqualityOfTwoArray {
	boolean result= true;
	
	public void checkEquality(int[] num1, int[] num2)
	{
		
		if(num1.length==num2.length){
			for(int i=0; i<num1.length; i++){
				if(!(num1[i]==num2[i]))
				{
					result= false;
					
				}
				
			}
		}
		
		System.out.println("Array are equal ? "+ result);
		
	}

	
	public static void main(String[] args) {
		EqualityOfTwoArray obj= new EqualityOfTwoArray();
		
		int[] num1 = {21, 57, 11, 37, 24};
        
        int[] num2 = {21, 57, 11, 37, 24};
		obj.checkEquality(num1, num2);
	}
}

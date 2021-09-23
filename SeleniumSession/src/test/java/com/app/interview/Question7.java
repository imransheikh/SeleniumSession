package com.app.interview;

/**
 @author Imran
 
 1. compilation error will occured because local variable was not initialized 
 
 */
public class Question7 {
	
	public static void main(String[] args) {
		
		float x= 0.0f;
		int y=5;
		long z=0;
		
		x=y+3.3f;
		x=x+z;
		System.out.println(x);
		
		
	}

}

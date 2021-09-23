package com.app.interview;

import java.util.ArrayList;

public class Question22 {
	
	public static void main(String[] args) {
		ArrayList<Object> sameArray= new ArrayList<Object>();
		sameArray.add(new Object());
		sameArray.ensureCapacity(15);
		int size= sameArray.size();
		System.out.println("Size is : " + size);
	}
	
	

}

package com.app.interview;

import java.util.ArrayList;

/**
 * @author Imran
 
1. The capacity is the total number of cells.
2. The size is the number of cells that have data in them.
 
 
 */
public class Question18 {
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>(9);
		a.add(1);
		a.add(5);
		a.add(10);
		a.add(12);
		a.add(15);
		a.trimToSize();
		System.out.println("Size of the array : " + a.size());
		System.out.println("The last element are: ");
		for(Integer number: a)
		{
			System.out.println("Number = " + number);
		}
	}

}

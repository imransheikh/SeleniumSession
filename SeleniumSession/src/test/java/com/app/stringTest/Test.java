package com.app.stringTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	
	
	public void testMissingNumber(List<Integer> storedNumber)
	{
		int [] chekNumer= {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		
		for(int i=0; i<chekNumer.length; i++)
		{
			if(!(storedNumber.contains(chekNumer[i])))
			{
				System.out.println("No..I am not exist in this list : " + chekNumer[i]);
			}
			
			/*else if (storedNumber.contains(chekNumer[i]))
				{
					System.out.println("Yes..I am  exist in this list : " + chekNumer[i]);
				}*/
		}
		
		
	}
		
		public  int missingNumber(int[] arr)
		 {
		  int n=arr.length+1;
		  System.out.println("My length is: "+ n);
		  int sum=n*(n+1)/2;
		  int restSum=0;
		  for (int i = 0; i < arr.length; i++) {
		   restSum+=arr[i];
		  }
		  int missingNumber=sum-restSum;
		  return missingNumber;
		 }
		
	
	
	public static void main(String[] args) {
		List<Integer> no= new ArrayList<Integer>();
		no.add(1);
		no.add(2);
		no.add(3);
		no.add(4);
		no.add(6);
		no.add(7);
		no.add(8);
		no.add(9);
		no.add(10);
		
		Test t= new Test();
		//t.testMissingNumber(no);
		
		
		int[] arr1={7,5,6,1,4,2};
		  System.out.println("Missing number from array arr1: "+t.missingNumber(arr1));
		  int[] arr2={5,3,1,2};
		  System.out.println("Missing number from array arr2: "+t.missingNumber(arr2));
		
	}

}

package com.app.ArrayInterview;

public class PrintEvenPositionNumber {
	
	public void printEvenPosition()
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println("");
		for(int i=0; i<arr.length; i++)
		{

				System.out.print(arr[i]);
				System.out.print("\t");

		}
		System.out.println();
		System.out.println("Even Numbers");
		
		for(int i=0; i<arr.length; i++)
		{
			if((i%2)!=0)
			{
				System.out.print(arr[i]);
				System.out.print("\t");
			}
		}
	}
	
	public void printOddPosition()
	{
		System.out.println();
		System.out.println("Odd  Numbers");
		System.out.println();
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i=0; i<arr.length; i++)
		{
			if((i%2)==0)
			{
				System.out.print(arr[i]);
				System.out.print("\t");
			}
		}
	}
	
	public static void main(String[] args) {
		PrintEvenPositionNumber obj= new PrintEvenPositionNumber();
		obj.printEvenPosition();
		obj.printOddPosition();
	}

}

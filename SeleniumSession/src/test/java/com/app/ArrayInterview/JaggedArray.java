package com.app.ArrayInterview;

public class JaggedArray {
	
	
	
	
	public void TestJagged()
	{
		int array[][]= new int [3][];
		
		array [0] = new int [3];
		array [1] = new int [4];
		array [2] = new int [2];
		
		//Initialize the jagged array
		int count=0;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				array[i][j]= count++;
				System.out.print(array[i][j] +  "   ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		JaggedArray obj= new JaggedArray();
		obj.TestJagged();
		
	}
	
	
	
	
	
	

}

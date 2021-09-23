package com.app.ArrayInterview;

public class AddTwoMatrices {
	
	
	public void AddTwoMat()
	{
		int arrOne[][]= {{1,2,3} , {4,5,6}, {7,8,9}};
		
		int arrTwo[][]= {{2,2,3} , {4,5,6}, {7,8,9}};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arrOne[i][j] + "   ");
			}
			System.out.println();
		}
		
	
		System.out.println("====================");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arrTwo[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		System.out.println("Addition of Two Matrics");
		int sum[][]= new int[3][3];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				sum[i][j]= arrOne[i][j] + arrTwo[i][j];
				
			}
			System.out.println();
		}
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(sum[i][j] + "   ");
				
			}
			System.out.println();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		AddTwoMatrices obj= new AddTwoMatrices();
		obj.AddTwoMat();
	}

}

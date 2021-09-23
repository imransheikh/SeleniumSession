package com.app.stringTest;

public class FindSecondLargestNumber {
	
	public void findSecondLargestNumber(int[] num)
	{
		int firstLargest = 0;
		int secondLargest = 0;

		for (Integer i : num) {
			System.out.println("Numbers: " + i);
		}

		if (firstLargest > secondLargest) {
			num[0] = firstLargest;
		} else if (secondLargest > firstLargest) {
			num[1] = secondLargest;
		}
		
		for(int k=2; k<num.length; k++)
		{
			if(num[k]>num[0])
			{
				num[1]= num[0];
				num[0]= num[k];
		
			}
			else if(num[k]<num[0] && num[k]>num[1])
			{
				num[1]=num[k];
			}
		}
			
		System.out.println("First & Second largest Number: " + num[0] +"," + num[1]);
	}
	
	public static void main(String[] args) {
		FindSecondLargestNumber obj= new FindSecondLargestNumber();
		int[] num= {1, 3, 4, 17, 5};
		obj.findSecondLargestNumber(num);
	}

}

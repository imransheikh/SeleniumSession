package com.app.ArrayInterview;

public class FindDuplicateElements {
	
	
	
	public void getDuplicate(int[] arr)
	{
		
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			// {1,2,4,6,7,3,1,2,6,1,4,4,4};
			for (int m = i + 1; m < arr.length; m++) {
				if (arr[i] == arr[m]) {
					count++;
					arr[m] = -1;
				}
			}

			if (arr[i] != -1) {
				if (count>1) {
					System.out.println("No is: " + arr[i] + "  Frequency is: "
							+ count);
				}

			}

		}
	}

	
	public static void main(String[] args) {
		
		FindDuplicateElements obj= new FindDuplicateElements();
		int[] arr= {1,2,4,6,7,3,1,2,6,1,4,4,4};
		obj.getDuplicate(arr);
	}

}

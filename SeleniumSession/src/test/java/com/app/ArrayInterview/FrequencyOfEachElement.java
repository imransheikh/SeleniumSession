package com.app.ArrayInterview;

public class FrequencyOfEachElement {

	public void testFreq() {
		int arr[] = { 1, 2, 7, 6, 8, 1, 2, 2, 6 };
		int visited = -1;
		int fr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
					
				}
			}

			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		
		System.out.println();
		System.out.println("Printing the element and their frequency !!");
		for (int m = 0; m < fr.length; m++) {

			if (fr[m] != visited) {
				System.out.println("Element : " + arr[m] + "  Frequency : " + fr[m]);
			}

		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		FrequencyOfEachElement obj= new FrequencyOfEachElement();
		obj.testFreq();
	}

}

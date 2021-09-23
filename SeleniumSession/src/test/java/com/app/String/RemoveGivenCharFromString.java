package com.app.String;

public class RemoveGivenCharFromString {

	public void testRemoveCharFromString() {
		String str = "Imran Sheikh";
		char c = 'e';
		StringBuffer bf = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
			if (!(c == str.charAt(i))) {
				System.out.println("Matched: " + str.charAt(i));
				bf.append(str.charAt(i));
			}
		}

		System.out.println(bf.toString());
	}

	public void testRemoveCharFromString2() {

		// Substring :> substring method where start index is inclusive and end index is
		// exclusive.
		String str = "Imran Sheikh";
		System.out.println("Orignal String: " + str);
		// removing char is 'h'
		System.out.println(str.substring(0, 6));
		String strnew = str.substring(0, 6) + str.substring(7, str.length());
		System.out.println("New  String: " + strnew);
		
		
		
		String Str = new String("Welcome to geeksforgeeks"); 
		System.out.print("The extracted substring is : "); 
		System.out.println(Str.substring(13)); 

	}
	
	public void testRemoveCharFromString3(String str, String s) {
		
		if(str==null)
		{
			System.out.println("String is empty...");
		}
		else {
			String strNew= str.replaceAll(s, "");
			System.out.println("New String: " + strNew);
		}

		
	}

	public static void main(String[] args) {
		RemoveGivenCharFromString obj = new RemoveGivenCharFromString();
		//obj.testRemoveCharFromString();
		obj.testRemoveCharFromString2();
		//obj.testRemoveCharFromString3("Pratapgarh", "p");
	}
}

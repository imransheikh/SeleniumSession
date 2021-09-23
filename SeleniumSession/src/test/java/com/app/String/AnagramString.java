package com.app.String;

import java.util.Arrays;

public class AnagramString {

	public void testAnagram(String str1, String str2) {
		//System.out.println("I am anagram");
		String s1= str1.replace("\\s", "");
		String s2= str2.replace("\\s", "");

		char[] str1Array = s1.toLowerCase().toCharArray();
		char[] str2Array = s2.toLowerCase().toCharArray();

		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		if (Arrays.equals(str1Array, str2Array)) {
			System.out.println("Yes I am anagram");
		} else {
			System.out.println("No I am not anagram");
		}
	}

	public static void main(String[] args) {

		AnagramString obj = new AnagramString();
		String str1 = "Listen rd";
		String str2 = "Silent dr";
		obj.testAnagram(str1, str2);
	}
}

package com.app.interview;

public class Question30 {

	public static void main(String[] args) {

		String s1 = "Testing";
		String s2 = new String("Testing");
		String s3 = "Testing";

		if (s1 == s2) {
			System.out.println("s1 and s2 equal");
		}

		else {
			System.out.println("s1 and s2 not equal");
		}

		if (s1 == s3) {
			System.out.println("s1 and s3 equal");
		}

		else {
			System.out.println("s1 and s3 not equal");
		}
	}

}

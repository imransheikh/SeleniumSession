package com.app.ArrayInterview;

/**
 * @author Imran
 * 
 *         1 
 *         01
 *         101
 *         0101
 *         10101
 *
 * 
 */
public class TestPractice {

	public void testPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("1");
				}

				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		TestPractice obj = new TestPractice();
		obj.testPattern();

	}

}

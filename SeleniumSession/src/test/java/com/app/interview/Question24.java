package com.app.interview;


/**
 * @author Imran

The & operator in Java has two definite functions:

As a Relational Operator: & is used as a relational operator to check a conditional statement just like && operator.
Both even give the same result, i.e. true if all conditions are true, false if any one condition is false.
However, there is a slight difference between them, which highlights the functionality of & operator:

- && operator: It only evaluates the next condition, if the condition before it is true. If anyone condition is false, it does not evaluate the statement any further.
- & operator: It evaluates all conditions even if they are false. Thus, any change in the data values due to the conditions will only be reflected in this case.




 */
public class Question24 {
	
	public static void main(String[] args) {
		
		String test1= "Test";
		String test2= new String ("Test");
		String test3= "Te" + "st";
		System.out.println(test1==test2);
		System.out.println(test1==test3);
		System.out.println(false && true);
		System.out.println(true & true);
		
	}

}

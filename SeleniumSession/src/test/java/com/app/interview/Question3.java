package com.app.interview;

import java.util.HashMap;



class A
{
	int i;
	int j;
	A()
	{
		i=1;
		j=2;
	}
}


/**
 * @author Imran
 Rules for defining Java Identifiers
 
 1. The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), 
 ‘$‘(dollar sign) and ‘_‘ (underscore).For example “geek@” is not a valid java identifier as it contain ‘@’ special character.
 
 2. Identifiers should not start with digits([0-9]). For example “123geeks” is a not a valid java identifier.
 *
 */
public class Question3 {
	
	public static void main(String[] args) {
		
		A obj1= new A();
		A obj2= new A();
		System.out.println(obj1.equals(obj2));
		
	}

}

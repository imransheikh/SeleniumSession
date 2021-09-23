package com.app.interview;

import java.util.Arrays;
import java.util.List;



/**
 * @author Imran


A. A local variable of type boolean defaults to null.
B. A local variable of type float defaults to 0.
C. A local variable of type Object defaults to null.
D. A local variable of type boolean defaults to false.
E. A local variable of type boolean defaults to true.
F. A local variable of type float defaults to 0.0.
G. None of the above.

Answer: 
Option G is correct because local variables do not get assigned default values.

The code fails to compile if a local variable is not explicitly initialized.

If this question were about instance variables, options D and F would be correct.

A boolean primitive defaults to false and a float primitive defaults to 0.0.


 */
public class Question11 {
	
	public static double sumOfList(List<Number> list)
	{
		double s=0.0;
		for(Number n:list)
		{
			s+= n.doubleValue();
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		
		List ld= Arrays.asList(1.2, 2.3, 3.5);
		System.out.println(sumOfList(ld));
	}

}

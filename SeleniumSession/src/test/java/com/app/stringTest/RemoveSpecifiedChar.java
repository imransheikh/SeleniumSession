package com.app.stringTest;

public class RemoveSpecifiedChar {

	
public String testMethod (String str, String c)
{
	System.out.println("My Orignal String is: " + str);
	if(str==null)
		return null;
	//return str;
	System.out.println("My upper case is: " + str.toUpperCase());
	System.out.println("My lower case is: " + str.toLowerCase());
	System.out.println("My sub sequence are : " + str.subSequence(1, 5));
	
	return str.replaceAll(c, "");
}

public void comapreString (String first, String second)
{
	System.out.println("Is my string equals case sensitive" + first.compareTo(second));
	System.out.println("Is my string equals ignore case " + first.compareToIgnoreCase(second));
}
	

public void stringToChar()
{
	String str = "journaldev";
	
	//string to char array
	char[] chars = str.toCharArray();
	System.out.println(chars.length);
	
	//char at specific index
	char c = str.charAt(2);
	System.out.println(c);
	
	//Copy string characters to char array
	char[] chars1 = new char[10];
	str.getChars(0, 4, chars1, 0);
	//str.getChars(0, 10, chars1, 0);
	System.out.println(chars1);
}

public static void main(String[] args) {
	RemoveSpecifiedChar rc= new RemoveSpecifiedChar();
	String afterChanged= rc.testMethod("Imran", "r");
	System.out.println("Changed String is: " + afterChanged);
	//compare String method
	rc.comapreString ("Imran", "imran");
	rc.stringToChar();
}
}
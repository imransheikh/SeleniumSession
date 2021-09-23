package com.app.stringTest;

public class inJavaReverseStringByRecursion {

	
	
	public void getSubString()
	{
		String str = "Imran";
		String sub= str.substring(0,str.length()-1);
		System.out.println("my sub string is : " + sub);
	}
	
	String reverse= "";
	public String reverseString(String str){
        
		//System.out.println("My string length is : " + str.length());
		System.out.println("Sub String is : " +str.substring(0,str.length()-1) );
	//	System.out.println("character at :" +str.charAt(4) );*/
		
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)+ reverseString(str.substring(0,str.length()-1));
            System.out.println("my reversee String is : " + reverse);
            return reverse;
        }
    }
	
	public static void main(String[] args) {
		inJavaReverseStringByRecursion obj= new inJavaReverseStringByRecursion();
		/*String str= obj.reverseString("Imran");
		System.out.println("My reverse string is : " + str);*/
		obj.getSubString();
	}
}

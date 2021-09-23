package com.app.stringTest;


import java.util.*;  
public class TestObjectKeyMap{  
 public static void main(String args[]){  
   
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
 
  //HashMap<char[], int[]> hm= new HashMap<>();
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  hm.put(102,"Imran");  
  
  System.out.println("My key set are " +hm.keySet());
  System.out.println("My values  are " +hm.values());
  System.out.println("My entry set  are " +hm.entrySet());
  
  for(Map.Entry m:hm.entrySet()){  
   //System.out.println(m.getKey()+" "+m.getValue());  
  }  
  //System.out.println("My object key test" + hm.get(102));
 }  
}  
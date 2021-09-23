package com.app.interview;

import java.util.ArrayList;
import java.util.List;

public class UserInformation {
	
	
	int roll; 
	String name;
	String address;
	List<UserInformation> user;
	
	public UserInformation()
	{
	
		
	}
	
	
	public UserInformation(int roll, String name, String address)
	{
		this.roll= roll;
		this.name= name;
		this.address= address;
		
	}
	
	
	public List<UserInformation> getUserInformation()
	{
		return  user;
	}
	
	public static void main(String[] args) {
		
		List<UserInformation> users= new ArrayList<UserInformation>();
		UserInformation u1= new UserInformation(01, "Imran", "Delhi");
		UserInformation u2= new UserInformation(02, "Sheikh", "Noida");
		users.add(u1);
		users.add(u2);
		
		UserInformation obj=new UserInformation();
		List<UserInformation> testData= obj.getUserInformation();
		System.out.println(testData);
		
		for (UserInformation us : testData) {
			System.out.println(us.roll + " " + us.name + " " + us.address);

		}
		
		/*
		 * //System.out.println(UserInformation us: users); for (UserInformation us :
		 * users) { System.out.println(us.roll + " " + us.name + " " + us.address);
		 * 
		 * }
		 */
		
	}

}

package com.app.interview;

import java.util.ArrayList;
import java.util.List;

class UserTest {
	public int id;
	public String name;
	public List<String> roles;
	List<UserTest> users;
	public UserTest() {
	}

	public UserTest(int id, String name, List<String> roles) {
		this.id = id;
		this.name = name;
		this.roles = roles;
	}

	public List<String> getRoles(int userId, List<UserTest> user2) {
		users= user2;
		for (UserTest us : users) {
			// System.out.println(us.roles.size());
			if (us.id == userId) {
				System.out.println("User ID : " + us.id);
				for (String s : us.roles) {
					System.out.print(s + " ");
				}
				break;
			}
		}
		return null;
	}

}

public class CustomObjects {
	public static void main(String[] args) {

		List<UserTest> users = new ArrayList<UserTest>();

		List<String> role1 = new ArrayList<String>();
		role1.add("Role1");
		role1.add("Role2");

		List<String> role2 = new ArrayList<String>();
		role2.add("Role3");
		role2.add("Role4");

		List<String> role3 = new ArrayList<String>();
		role3.add("Role5");
		role3.add("Role6");

		users.add(new UserTest(1, "Anna Administrator", role1));
		users.add(new UserTest(2, "Charles N. Charge", role2));
		users.add(new UserTest(7, "Ryder", role3));

		/*
		 * for (UserTest us : users) { if(us.id==7) { System.out.println("User ID : " +
		 * us.id); for (String s : us.roles) { System.out.print(s + " ");
		 * 
		 * } break; }
		 * 
		 * }
		 */
		
		
		  UserTest obj= new UserTest();
		  List<String> testRoles= obj.getRoles(1, users);
		  
		  //for(String s: testRoles) { System.out.print(s + " "); }
		  
		 

	}
}

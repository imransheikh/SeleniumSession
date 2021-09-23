package com.app.interview;


import java.util.*;

class Permission {
  //public Permission() {}
  public Permission(String role, String name, boolean active) {
    this.role = role;
    this.name = name;
    this.active = active;
  }

  public String role;
  public String name;
  public boolean active;
}

class User {
  //public User() {}
  public User(int id, String name, List<String> roles) {
    this.id = id;
    this.name = name;
    this.roles = roles;
  }
  public int id;
  public String name;
  public List<String> roles;
}

class Authorization {
  public List<Permission> permissions;
  public List<User> users;

  public Authorization(List<Permission> permissions, List<User> users) {
    this.permissions = permissions;
    this.users = users;
  }

  public ArrayList<String> listPermissions(int userId) {
    
	  Authorization authorization1= new Authorization(permissions, users);
	 // authorization1= 
	  
	  
	
	  
	 // System.out.println(user.get(userId));
  
    return null;
  }
  
  
  public List<String> getRoles(int userId, Authorization authorization) {
	 List<User> usere=  authorization.users;
		for (User us : usere) {
			// System.out.println(us.roles.size());
			if (us.id == userId) {
				System.out.println("User ID : " + us.roles);
				for (String s : us.roles) {
					System.out.print(s + " ");
				}
				break;
			}
		}
		return null;
	}


  public boolean checkPermitted(String permissionName, int userId) {
    // TODO: fill this out!
   // throw new RuntimeException("Please remove this when you implement this function");
	  return true;
  }
}


public class TestClass {
	public static void main(String[] args) {
		
		 List<User> users = new ArrayList<User>();

		    List<String> role1= new ArrayList();
		    role1.add("abc");
		    role1.add("def");
		    
		    List<String> role2= new ArrayList();
		    role2.add("ghi");
		    role2.add("jkl");
		    
		    List<String> role3= new ArrayList();
		    role3.add("mno");
		    role3.add("pqr");
		    
		    users.add(new User(1, "Anna Administrator", role1));
		    users.add(new User(2, "Charles N. Charge", role2));
		    users.add(new User(7, "Ryder", role3));
		    
		    
		    System.out.println("Users are : " + users.toString());
		    
		    List<User> getUsers= new ArrayList<User>();
		    
		    for(User us: users) 
		    {
		    	//System.out.println(us.roles);
		    	List<String> rl= new ArrayList<>();
		    	
		    	System.out.println(us.roles.size());
		    	for(String s: us.roles)
		    	{
		    		System.out.println("Roles are : " + s);
		    	}
		    	System.out.println("====================");
				/*
				 * if(us.id==5) { System.out.println(us.roles); List<String> rl= us.roles;
				 * System.out.println("Roles are: " + rl);
				 * 
				 * }
				 */
		    	
		    }
		    
		    
		    
		    
		    
		    
		
	}
}
    


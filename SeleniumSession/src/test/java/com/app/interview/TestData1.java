package com.app.interview;

//import org.junit.Before;
//import org.junit.Test;
import org.testng.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import java.util.*;

public class TestData1 {
  private Authorization authorization;

  @BeforeClass
  public void setUp() {
    List<User> users = new ArrayList<User>();

    List<String> role1= new ArrayList();
    role1.add("superuser");
    role1.add("charger");
    
    List<String> role2= new ArrayList();
    role2.add("superuser");
   
    
    List<String> role3= new ArrayList();
    role2.add("rider");
    
    
    users.add(new User(1, "Anna Administrator", role1));
    users.add(new User(2, "Charles N. Charge", role2));
    users.add(new User(7, "Ryder", role3));
 
    List<Permission> permissions = new ArrayList<Permission>();

    permissions.add(new Permission("superuser", "lock user account", true));
    permissions.add(new Permission("superuser", "unlock user account", true));
    permissions.add(new Permission("superuser", "purchase widgets", false));
    permissions.add(new Permission("charger", "view pick up locations", true));
    permissions.add(new Permission("rider", "view my profile", true));
    permissions.add(new Permission("rider", "scooters near me", true));

    authorization = new Authorization(permissions, users);
  }

  @Test
  public void listPermissionsReturnsCorrectPermissionNamesWhenThereIsOneRole() {
	  authorization.getRoles(1, authorization);
	  ArrayList<String> result = authorization.listPermissions(7);
    
    assertEquals(true, result.contains("view my profile"));
    assertEquals(true, result.contains("scooters near me"));
    assertEquals(2, result.size());
  }

  @Test
  public void checkPermittedReturnsTrueForAllOfThePermissionsThatExistForTheUser() {
    assertEquals(true, authorization.checkPermitted("view pick up locations", 2));
    assertEquals(true, authorization.checkPermitted("view my profile", 2));
    assertEquals(true, authorization.checkPermitted("scooters near me", 2));
  }
}


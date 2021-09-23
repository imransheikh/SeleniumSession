package com.app.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	
	@Test(dataProvider = "TestDataProvider")
	public void testMethod(String test1, String test2)
	{
		System.out.println("Test data 1 : " + test1 + " Test data 2 : " + test2);
	}
	
	
	@DataProvider(name = "TestDataProvider")
	public Object[][] TestObj()
	{
		Object [][] testData= new Object[2][2];
		testData[0][0]= "Test1";
		testData[0][1]= "Test2";
		testData[1][0]= "Test3";
		testData[1][1]= "Test4";
		return testData;
	}

}

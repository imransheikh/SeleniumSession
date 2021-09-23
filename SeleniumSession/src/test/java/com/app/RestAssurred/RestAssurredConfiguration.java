package com.app.RestAssurred;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeSuite;

public class RestAssurredConfiguration {
	
	
	
	
	@BeforeSuite(alwaysRun= true)
	public void configure()
	{
		RestAssured.baseURI= "http://restcountries.eu";
		RestAssured.basePath= "/rest/v1";
	}
	
	
	
	

}

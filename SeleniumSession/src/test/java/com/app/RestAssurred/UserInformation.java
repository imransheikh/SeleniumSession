package com.app.RestAssurred;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInformation {
	@JsonProperty("page")
	  public int page1;
	
	@JsonProperty("per_page")
	  public int per_page1;
	
	@JsonProperty("total")
	  public int total2;
	
	@JsonProperty("total_pages")
	  public int total_pages1;
	
	
	class classTest{
		
		@JsonProperty("id")
		public int id1;
		
		@JsonProperty("first_name")
		public int first_name1;
		
		@JsonProperty("last_name")
		public int last_name1;
		
		@JsonProperty("avatar")
		public int avatar1;
		
	}
	
	
	/*//node variables: 
	public int page;
	public int per_page;
	public int total;
	public int total_pages;
	//public Object data;
*/	

	

}

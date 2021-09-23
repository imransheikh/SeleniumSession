package com.app.collectionInterviewQuestions;

public class Human {
	
	String name;
	int adharNumber;
	
	public Human(String name, int adharNumber)
	{
		this.name= name;
		this.adharNumber= adharNumber;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return adharNumber;
	}
	
	@Override
	public boolean equals(Object obj) {

		Human human= (Human) obj;
		if(this.adharNumber !=human.adharNumber)
		{
			return false;
		}
		
		if(!(this.name.equals(human.name)))
		{
			return false;
		}
		return true;
	}
	
	

}

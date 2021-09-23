package com.app.interview;





public class Question15 {

	int empAge;
	public Question15(String ename)
	{
		System.out.println("Employee name is: " + ename);
	}
	
	
	public void setEmployee(int eage)
	{
		this.empAge= eage;
	}
	
	public int getEmployee()
	{
		System.out.println("Employee Age is: " + empAge);
		return empAge;
	}
	
	
	public static void main(String[] args) {
		
		Question15 obj= new Question15("Ramesh");
		obj.setEmployee(23);
		obj.getEmployee();
	}
	
}

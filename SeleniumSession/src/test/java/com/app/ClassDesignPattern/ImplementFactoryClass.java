package com.app.ClassDesignPattern;

public class ImplementFactoryClass {
	
	
	public FactoryDesignPattern getInstance(String factClassName)
	{
		if (factClassName==null) {
			return null;
		}
		if (factClassName.equals("Factory1")) {
			return new FactoryClass2();
		}
		else if (factClassName.equals("Factory2")) {
			return new FactoryClass1();
		}
		else if (factClassName.equals("Factory3")) {
			return new FactoryClass3();
		}
		return null;
		
	}
	
	
	public static void main(String[] args) {
		
		ImplementFactoryClass obj= new ImplementFactoryClass();
		FactoryDesignPattern ft4=obj.getInstance("Factory3");
		ft4.display();
		FactoryDesignPattern ft1= new FactoryClass1();
		ft1.display();
		FactoryDesignPattern ft2= new FactoryClass2();
		ft2.display();
		FactoryDesignPattern ft3= new FactoryClass3();
		ft3.display();
		
	}

}

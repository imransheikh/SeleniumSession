package com.app.ClassDesignPattern;

public class ImplementFactoryClass2 {
	
	
	public FactoryDesignPatternInterface  getClsssInstance(String className)
	{
		
		 if(className==null)
			{
				return null;
			}
		 
		if(className.equals("Class4"))
		{
			return new FactoryClass4();
		}
		else if(className.equals("Class5"))
		{
			return new FactoryClass5();
		}
		else if(className.equals("Class6"))
		{
			return new FactoryClass6();
		}
			
		return null;
		
		
	}

	
	public static void main(String[] args) {
		ImplementFactoryClass2 obj= new ImplementFactoryClass2();
		FactoryDesignPatternInterface tf= obj.getClsssInstance("Class6");
		tf.display();
		FactoryDesignPatternInterface tf1= obj.getClsssInstance("Class4");
		tf1.display();
	}
}

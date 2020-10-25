package com.abhi.java8features.newinterfaces;

@FunctionalInterface
public interface FunctionalInterfaceFormula 
{
	//must be override
	double calculate(int a );
	
	
	//optional to override
	default double sqrt(int no)
	{
		return Math.sqrt(no);
	}
	
	//option to override
	default void helloDefault()
	{
		System.out.println("this is a default method inside interface....");
	}
	
	static void helloStatic()
	{
		System.out.println("This is a static method inside interface....");
	}

}

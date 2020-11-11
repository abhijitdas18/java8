package com.abhi.java8features;

public class DefaultDemo implements DefualtInterface{

	public static void main(String[] args) {

		DefaultDemo d = new DefaultDemo();
		d.func1(); //Func1.....
		d.func2();  // Func2 ...
		d.func3();
	}
	public void func1()
	{
		System.out.println("Func1.....");
	}
	
	// Override the default function.
	public void func2()
	{
		System.out.println("Func2 ...");
	}
	
	

}

@FunctionalInterface
interface DefualtInterface{
	void func1();
	default void func2()
	{
		System.out.println("default func2....");
	}
	
	default void func3()
	{
		System.out.println("default func3.....");
	}
	
}

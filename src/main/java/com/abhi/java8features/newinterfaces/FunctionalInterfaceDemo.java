package com.abhi.java8features.newinterfaces;

public class FunctionalInterfaceDemo implements Motor01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          FunctionalInterfaceDemo f = new FunctionalInterfaceDemo();
          
          f.drive();
          f.gear();
          Motor.breakApply();
	}
	
	
	public void drive()
	{
		System.out.println("DRIVE>>>>>>>");
	}
	
	@Override
	public void gear()
	{
		System.out.println("GEAR OVRRIDE >>>>>>>>>>>>>>>>>>>>>");
	}
	
	//@Override
	public void gear1()
	{
		System.out.println("gear1()>>>>>>>>>>>>>>>>>>>");
	}

}

@FunctionalInterface
interface Motor01
{
	void drive();
	
	default void gear()
	{
		System.out.println("GEAR >>>>>>>>>>>>>>>>>>");
	}
	
	static void breakApply()
	{
		System.out.println("BREAK>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	
}
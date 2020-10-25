package com.abhi.java8features.newinterfaces;



public class FunctionalInterfaceMain implements FunctionalInterfaceFormula{

	// use the default method sqrt()
	@Override
	public double calculate(int a) {
		return sqrt(a);
	}
	
	
	
	
	public static void main(String[] args) {

		FunctionalInterfaceFormula obj = new FunctionalInterfaceMain();
		System.out.println("calling ovveride method : " + obj.calculate(100));
		obj.helloDefault();
		
		
		///////////////////////////////////////
		// USe of Anonymous inner class
		
		
		FunctionalInterfaceFormula obj1 = new FunctionalInterfaceMain() {
			public double calculate(int nos) {
				double res =  sqrt(nos);
				System.out.println("this is use of inner Annoymous class....");
				return res;
			}			
		};
		
		System.out.println("use of inner method : " +obj1.calculate(25));

		
		FunctionalInterfaceFormula.helloStatic();
		
		/////////////////////////////////////////////////////////
		// use of lambda for functional interface
	}
	
	public void helloDefault() {
		System.out.println("this is a default method override....");
	}
	
}

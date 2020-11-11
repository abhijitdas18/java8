package com.abhi.java8features.lambda;

// a representation of an anonymous function
// A lambda consists of a list of parameters, a body, a return type and a list of exceptions which can be thrown
// it is very much a function, just anonymous.
public class LambdaEx02 {

	public static void main(String[] args)
	{
		FirstInterface firstInterface = (String str) -> {System.out.println("My lamda : " + str);};
		firstInterface.singleMethod("hiii");
		
		
		//We can now pass this instance as a parameter wherever FirstInterface is expected.
		//behavior parameterization � passing of behavior as a parameter
		LambdaEx02 ex02 = new LambdaEx02();
		ex02.print(firstInterface, "hello");
		ex02.print((String str) -> {System.out.println("My lamda : " + str);}, "hi");
	}
	
	public void print(FirstInterface firstInterface, String param)
	{
		firstInterface.singleMethod(param);
	}

	@FunctionalInterface
	public interface FirstInterface
	{
		public void singleMethod(String param);
	}
	
	//Lambda equivalent 
	//(String param)->{System.out.println("My lambda says "+param);};

}

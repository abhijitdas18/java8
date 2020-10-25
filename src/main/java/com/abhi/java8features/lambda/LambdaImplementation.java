package com.abhi.java8features.lambda;

public class LambdaImplementation {
	
	public static void main(String[]a)
	{
		
        HelloInterface helloObj = new A();
        helloObj.hello();
        
        
		HelloInterface helloObjAnnoy = new A() {
			public void hello() {
				System.out.println("this is from anonymous inner class");
			}
		};
		
		helloObjAnnoy.hello();		
		
		// use of functional interface by lambda expression
		HelloInterface h = () -> System.out.println("This is lambda implementation"); 
		h.hello();
				
	}

}

class A implements HelloInterface
{

	@Override
	public void hello() {
		 System.out.println("hello");			
	}
	
}

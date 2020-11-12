package com.abhi.java8features.methodreference;

public class MethodReferenceEx01 {

	public static void main(String[] args) {

		//1st approach --anonymous class
		Sayable ref01 = new Sayable() {
			public void say() {
				System.out.println("this is inner class implementation....");
			}
		};
		
		ref01.say();
		
		//2nd approach
		Sayable ref02 = () -> System.out.println("this is lambda implementation....");

		ref02.say();
		
		//1st approach call static method
		MethodReferenceEx01.saySomething();
		
		//2nd  approach - Referring static method
		Sayable ref03 = MethodReferenceEx01::saySomething;		
		ref03.say();
	}

	public static void saySomething() {
		System.out.println("This is a static method....");
	}

}

interface Sayable {
	void say();
}

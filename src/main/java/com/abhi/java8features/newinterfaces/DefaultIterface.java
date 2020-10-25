package com.abhi.java8features.newinterfaces;

public class DefaultIterface implements A1, B {

	public static void main(String[] args) {

		DefaultIterface d = new DefaultIterface();
		d.defaultMethod();

	}

	@Override
	public void func() {
		System.out.println("func() is override.....");
	}

	// Override is must as both the interface have the same default method 
	@Override
	public void defaultMethod() {
		System.out.println("Override default method....");
	}

}

interface A1 {
	public void func();

	default void defaultMethod() {
		System.out.println("A1 : defaultMethod");
	}
}

interface B {
	public void func();

	default void defaultMethod() {
		System.out.println("B : defaultMethod");
	}

}
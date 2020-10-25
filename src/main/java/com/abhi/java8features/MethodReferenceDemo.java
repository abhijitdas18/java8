package com.abhi.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Navin","Manoj", "Priya", "Anto");
		
		names.forEach(str -> System.out.println(str));
		
		//method reference - passing method as parameter
		names.forEach(System.out ::println);
		
		
		String str = "Abhijit";
		MyPrinter mp = new MyPrinter();
		mp.print(str);
		
	}

}

class MyPrinter
{
	public void print(String str)
	{
		System.out.println(str);
	}
}

package com.abhi.java8features.stream.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFunction {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,5,4,7,9,12,3,4);
		
		
		//Display the list	
		list.forEach(x -> System.out.println(x));
		
/////////////////////////////////////////////////////////////////////////////////
		//forEach(Consumer c)
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("using consumer imple : " + t);
			}
			
		};
		
		list.forEach(c);
		
		/////////////////////////////////////////////////////////////////
		//Sum of the array elements, using map
		int s = list.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println("sum :" + s);
		
		Function<Integer, Integer> aFunction = new Function<Integer, Integer>() {
			
			public Integer apply(Integer a)
			{
				return a*a;
			}
			
			
		};
		System.out.println("Squaring using map : ");
		System.out.println(list.stream().map(aFunction).collect(Collectors.toList()));
		
		///////////////////////////////////////
		// map(Fnction)
		// Get the even integer from list of string of integer
		List<String> str = Arrays.asList("2", "12", "3", "6", "1");
		
		// convert string into integer
		// The map(Function mapper) method takes a Function, technically speaking, 
		//an object of java.util.function.Function interface. 
		//This function is then applied to each element of Stream to convert it into the type you want.

        // Since, we need to convert an String to an Integer, we can pass either 
		//the Integer.parseInt() or Integer.valueOf() method to the map() function.
		List <Integer> l = str.stream().map(x->Integer.valueOf(x)).filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println("event no :" + l);
		
	}

}

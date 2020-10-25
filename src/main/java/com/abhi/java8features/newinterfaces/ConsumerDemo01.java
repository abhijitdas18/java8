package com.abhi.java8features.newinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo01 {

	public static void main(String[] args) {

		// conventional approach
		MyInterface01 a = new Xyz();
		a.show();
		
		// Inner class approach
		MyInterface01 a1 = new MyInterface01() {
			@Override
			public void show()
			{
				System.out.println("Inner class implementation");
			}
		};
		a1.show();
		
		//  Lambda approach
		System.out.println("_______________1__________________________");
		MyInterface01 a2 = () -> System.out.println("Implementaion by Lambda expression"); 
		// Implementation of some interface of type A
		// That interface is consumer interface
		a2.show();
		
		//Consumer interface
		List <Integer> numbers = Arrays.asList(4,5,6,7,8);
		System.out.println("Default implemenation of forEach.");
		numbers.forEach(x -> System.out.print(x));
		
	    Consumer <Integer> cons = new ConsumerImpl();
	    
		//Display the list values
		//numbers.forEach(Consumer interface);
	    System.out.println("\n_______________2__________________________");
	    numbers.forEach(cons);
	    
	    Consumer <Integer> cons01 = new Consumer<Integer>() {
	    	public void accept(Integer a)
	    	{
	    		System.out.println("Square  :" + a *a);
	    	}			
	    };
		
	    System.out.println("\n_______________3__________________________");
		numbers.forEach(cons01);
		
		Consumer <Integer> cons02 = (Integer b) -> {
			{
	    		System.out.println("Cube  :" + b *b*b);
			};
		};
		System.out.println("\n_______________4__________________________");
		numbers.forEach(cons02);
		
		System.out.println("\n_______________4__________________________");
		Consumer <Integer> cons03 = b -> System.out.println(b);
		numbers.forEach(cons03);
		
		System.out.println("\n_______________4__________________________");
		numbers.forEach(x -> System.out.println(x));
		//////////////////////////////////////
		Consumer<Integer> cons04 =  new Consumer<Integer>() {
			public void accept(Integer a) {
				System.out.print("This is use of consumer : " + a +" - ");
			}
		};
		System.out.println("\n_______________5__________________________");
		numbers.forEach(cons04);
		
		
		Consumer cons05 = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("This is implementation of consumer interface :" + i);
			}
		};
		System.out.println("\n_______________6__________________________");
		numbers.forEach(cons05);
	}
}


// Implements a functional interface
class ConsumerImpl implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.print("value is  : " + i +",");
	}
}

interface MyInterface01
{
	void show();
}


class Xyz implements MyInterface01
{
	@Override
	public void show()
	{
		System.out.println("Implementation of show()");
	}
}
package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		
		// Use of consumer interface
		Consumer<Integer> action = new Consumer<Integer>() {			
			public void accept(Integer x) {
				System.out.print(x*x + " ");				
			}
		};
		//forEach(Consumer)
		numbers.stream().forEach(action);
		System.out.println();
		System.out.println("******************************");
		
		numbers.stream().forEach(x->System.out.print(x + " "));
		System.out.println();
		System.out.println("******************************");
		
		numbers.stream().forEach(x -> System.out.print(x*x + " "));
		System.out.println();
		System.out.println("******************************");
		
		Stream <Integer> stream = numbers.stream();
		stream.forEach(x -> System.out.print(x + " "));
		//stream.forEach(x -> System.out.println(x)); // Exception : stream has already been operated upon or closed
		System.out.println();
		System.out.println("******************************");
		
		List<String> names = Arrays.asList("Raju", "Utpal", "Pranab", "Pankaj", "Raj Kumar", "Madhu", "Mubashir", "Gopal", "Priya");
		// Get the all names without Pranab 
		System.out.println("With Stream : wihtout Pranab");
		names.stream()
		.filter(new Predicate<String>() {
			public boolean test(String name) {
				return !name.equals("Pranab");
			}
		})
		.forEach(x -> System.out.println(x));
		
		System.out.println("******************************");
		names.stream().filter(name -> !name.equals("Pranab")).forEach(name -> System.out.println("Names without pranab: "+ name));
		System.out.println("******************************");
		
		System.out.println("With lambda : only Pranab");
		names.stream().filter(p -> p.equals("Pranab")).forEach(System.out::println);
		
		System.out.println("With lambda : without Pankaj");
		names.stream().filter(name -> !name.equals("Pankaj")).forEach(new Consumer<String>() {
			public void accept(String str)
			{
				System.out.println(str);
			}
		});
		
		System.out.println("With lambda : all");
		names.stream().filter(x -> true).forEach(System.out::println);
		
		System.out.println("Count names starts with 'P'");
		int count = (int) names.stream().filter(x -> x.startsWith("P")).count();
		System.out.println("Count : " + count);
		
		System.out.println("");
		int ct = (int) names.stream().filter(name -> name.length() == 5).count();
		System.out.println("Count with 5 char :" + ct);
		System.out.println("Create a list of names starts with 'P'");
		
		List<String> list = names.stream().filter(name -> name.length() == 5).collect(Collectors.toList());
		System.out.println("Name with 5 char :" + list);
		
		
		List <String> resultList = names.stream().filter(x -> x.startsWith("P")).collect(Collectors.toList());
		System.out.println("Result : " + resultList);
		
		
		
		
	}

}

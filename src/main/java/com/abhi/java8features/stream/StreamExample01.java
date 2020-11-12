package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.abhi.java8features.helper.Employee;
import com.abhi.java8features.helper.Gender;

public class StreamExample01 {

	// Create Person object
	private static List<Employee> createPerson() {
		List<Employee> employees = Arrays.asList(new Employee("Abhijit", 40, Gender.MALE),
				new Employee("Madhu", 32, Gender.FEMALE), new Employee("Raj", 21, Gender.MALE),
				new Employee("Simi", 17, Gender.FEMALE), new Employee("Sara", 20, Gender.FEMALE),
				new Employee("Sara", 22, Gender.FEMALE), new Employee("Bob", 20, Gender.MALE),
				new Employee("Paula", 32, Gender.FEMALE), new Employee("Paul", 32, Gender.MALE),
				new Employee("Jack", 2, Gender.MALE), new Employee("Jack", 72, Gender.MALE),
				new Employee("Jill", 12, Gender.FEMALE));

		return employees;
	}

	public static void main(String[] args) {

		List<Employee> employees = createPerson();

		// Use of Stream, map is used to implement uppercase function
		// filter return a object of Person.
		// map returns a String
		System.out.println("\n\nFind in uppercase, the names of all female older than 18 ::");
		List<String> female = employees.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.filter(per -> per.getAge() >= 18).map(per -> per.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println("Female : " + female);
		
				

		System.out.println("\n\n Find all names start with 's' and age is > 18");
		List<String> name = employees.stream().filter(p -> p.getName().startsWith("S")).filter(p -> p.getAge() > 18)
				.map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Name : " + name);
		System.out.println("\n\nUse Stream - print all males :::");
		employees.stream().filter(per -> per.getGender() == Gender.MALE).forEach(System.out::println);

		System.out.println("\n\nprint all females as a object :::");
		List<Employee> femaleEmployees = employees.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.collect(Collectors.toList());

		System.out.println("female Person : " + femaleEmployees);

		System.out.println("\n\nprint all males, but with name in uppercase :::");
		employees.stream().filter(per -> per.getGender() == Gender.MALE)
				.map(per -> new Employee(per.getName().toUpperCase(), per.getAge(), per.getGender()))
				.forEach(System.out::println);

		System.out.println("\n\n print female with age >50");
		List<String> p = employees.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.filter(per -> per.getAge() >= 18).map(per -> per.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println(p);

	}

}

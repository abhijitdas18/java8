package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.abhi.java8features.helper.Gender;
import com.abhi.java8features.helper.Person;

public class StreamExample01 {

	// Create Person object
	private static List<Person> createPerson() {
		List<Person> persons = Arrays.asList(new Person("Abhijit", 40, Gender.MALE),
				new Person("Madhu", 32, Gender.FEMALE), new Person("Raj", 21, Gender.MALE),
				new Person("Simi", 17, Gender.FEMALE), new Person("Sara", 20, Gender.FEMALE),
				new Person("Sara", 22, Gender.FEMALE), new Person("Bob", 20, Gender.MALE),
				new Person("Paula", 32, Gender.FEMALE), new Person("Paul", 32, Gender.MALE),
				new Person("Jack", 2, Gender.MALE), new Person("Jack", 72, Gender.MALE),
				new Person("Jill", 12, Gender.FEMALE));

		return persons;
	}

	public static void main(String[] args) {

		List<Person> persons = createPerson();

		// Use of Stream, map is used to implement uppercase function
		// filter return a object of Person.
		// map returns a String
		System.out.println("\n\nFind in uppercase, the names of all female older than 18 ::");
		List<String> female = persons.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.filter(per -> per.getAge() >= 18).map(per -> per.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println("Female : " + female);
		
				

		System.out.println("\n\n Find all names start with 's' and age is > 18");
		List<String> name = persons.stream().filter(p -> p.getName().startsWith("S")).filter(p -> p.getAge() > 18)
				.map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Name : " + name);
		System.out.println("\n\nUse Stream - print all males :::");
		persons.stream().filter(per -> per.getGender() == Gender.MALE).forEach(System.out::println);

		System.out.println("\n\nprint all females as a object :::");
		List<Person> femalePerson = persons.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.collect(Collectors.toList());

		System.out.println("female Person : " + femalePerson);

		System.out.println("\n\nprint all males, but with name in uppercase :::");
		persons.stream().filter(per -> per.getGender() == Gender.MALE)
				.map(per -> new Person(per.getName().toUpperCase(), per.getAge(), per.getGender()))
				.forEach(System.out::println);

		System.out.println("\n\n print female with age >50");
		List<String> p = persons.stream().filter(per -> per.getGender() == Gender.FEMALE)
				.filter(per -> per.getAge() >= 18).map(per -> per.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println(p);

	}

}

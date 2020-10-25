package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.abhi.java8features.helper.Gender;
import com.abhi.java8features.helper.Person;

//Stream.findAny()
//Optional<T> findAny()
//an exact element match is not needed but any element from the satisfying set can be picked up.

//Stream.findFirst()
//Optional<T> findFirst()

public class StreamEx01 {
	// Create Person object
	private static List<Person> createPerson() {
		List<Person> persons = Arrays.asList(new Person("Abhijit", 14, Gender.MALE),
				new Person("Madhu", 32, Gender.FEMALE), new Person("Raj", 21, Gender.MALE),
				new Person("Simi", 17, Gender.FEMALE), new Person("Sara", 20, Gender.FEMALE),
				new Person("Sara", 22, Gender.FEMALE), new Person("Bob", 20, Gender.MALE),
				new Person("Paula", 32, Gender.FEMALE), new Person("Paul", 32, Gender.MALE),
				new Person("Jack", 2, Gender.MALE), new Person("Jack", 72, Gender.MALE),
				new Person("Jill", 12, Gender.FEMALE));

		return persons;
	}

	public static void main(String[] args)
	{
		List<Person> persons = createPerson();
		Optional<Person> anyPersonAbove20 = persons.stream()
		.filter(per -> per.getAge() >20)
		.findAny();
		
		if(anyPersonAbove20.isPresent())
		{
			System.out.println("Person above age 20 is " + anyPersonAbove20.get());
		}
		
		Optional <Person> firstPersonAbove75 = persons.stream()
		.filter(per -> per.getAge() >75)
		.findFirst();
		
		if(firstPersonAbove75.isPresent())
		{
			System.out.println("Person above age 25 is " + firstPersonAbove75);
		}
        
		
	}

}

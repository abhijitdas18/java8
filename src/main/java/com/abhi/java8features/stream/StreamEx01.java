package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.abhi.java8features.helper.Employee;
import com.abhi.java8features.helper.Gender;

//Stream.findAny()
//Optional<T> findAny()
//an exact element match is not needed but any element from the satisfying set can be picked up.

//Stream.findFirst()
//Optional<T> findFirst()

public class StreamEx01 {
	// Create Person object
	private static List<Employee> createPerson() {
		List<Employee> employees = Arrays.asList(new Employee("Abhijit", 14, Gender.MALE),
				new Employee("Madhu", 32, Gender.FEMALE), new Employee("Raj", 21, Gender.MALE),
				new Employee("Simi", 17, Gender.FEMALE), new Employee("Sara", 20, Gender.FEMALE),
				new Employee("Sara", 22, Gender.FEMALE), new Employee("Bob", 20, Gender.MALE),
				new Employee("Paula", 32, Gender.FEMALE), new Employee("Paul", 32, Gender.MALE),
				new Employee("Jack", 2, Gender.MALE), new Employee("Jack", 72, Gender.MALE),
				new Employee("Jill", 12, Gender.FEMALE));

		return employees;
	}

	public static void main(String[] args)
	{
		List<Employee> employees = createPerson();
		Optional<Employee> anyPersonAbove20 = employees.stream()
		.filter(per -> per.getAge() >20)
		.findAny();
		
		if(anyPersonAbove20.isPresent())
		{
			System.out.println("Person above age 20 is " + anyPersonAbove20.get());
		}
		
		Optional <Employee> firstPersonAbove75 = employees.stream()
		.filter(per -> per.getAge() >75)
		.findFirst();
		
		if(firstPersonAbove75.isPresent())
		{
			System.out.println("Person above age 25 is " + firstPersonAbove75);
		}
        
		
	}

}

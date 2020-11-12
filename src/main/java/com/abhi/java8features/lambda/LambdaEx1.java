package com.abhi.java8features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.abhi.java8features.helper.Person;

public class LambdaEx1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println(people);
		// Step 1: Sort list by last name
		// Collections.sort(people, (p1, p2) ->
		// p1.getLastName().compareTo(p2.getLastName()));
		// sort(List<T> list, Comparator<? super T> c)
		System.out.println("Sorting by last NAME : Lambda expression way...................");
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println(people);

		System.out.println("Sorting by first name:");
		Collections.sort(people, (a1,a2) -> a1.getFirstName().compareTo(a2.getFirstName()));
		System.out.println(people);
		System.out.println("Conventional way...................");
		ComparatorImpl obj = new ComparatorImpl();

		Collections.sort(people, obj);
		System.out.println(people);
		
		System.out.println("Conventional way...................");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}

		});

		Collections.sort(people, new ComparatorImpl());
		System.out.println(people);

		// Step2 Create a method that prints all people that have last name beginning
		// with C

		Thread thread = new Thread(new Runnable() {
			public void run() {

			};
		});

		Thread t1 = new Thread();

		A obj1 = () -> System.out.println("hello");
		obj1.show();

	}

	interface A {
		void show();
	}

	private static void printConditionally(List<Person> person, Condition cond) {
		for (Person per : person) {

		}
	}
}

interface Condition {
	boolean test(String s);
}

class ComparatorImpl implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	}
}
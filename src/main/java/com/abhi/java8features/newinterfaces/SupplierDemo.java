package com.abhi.java8features.newinterfaces;

import com.abhi.java8features.helper.Person;
import com.abhi.java8features.helper.Gender;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;



//java.util.function.Supplier is a functional interface
//one abstract functional method T get(), returns newly generated values, T, in the stream. 
//The supplier does the opposite of the consumer, so it takes no arguments but it returns some value by calling its get() method.
//Person.java is a bean class, which we will use to supply the data using Supplier in the SupplierDemo 
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Person> supplier = () -> {
			return new Person("Abhijit", 42, Gender.MALE);
		};

		Person person = supplier.get();
		System.out.println("Person Details : " + person);

		/////////////////////// EX 02 //////////////////
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});

		///////////////////////// EX 03 ////////////////////////
		// Supplier instance with lambda expression
		Supplier<String> helloStrSupplier = () -> new String("Hello");
		String helloStr = helloStrSupplier.get();
		System.out.println("String in helloStr is->" + helloStr + "<-");

		// Supplier instance using method reference to default constructor
		Supplier<String> emptyStrSupplier = String::new;
		String emptyStr = emptyStrSupplier.get();
		System.out.println("String in emptyStr is->" + emptyStr + "<-");

		// Supplier instance using method reference to a static method
		Supplier<Date> dateSupplier = SupplierDemo::getSystemDate;
		Date systemDate = dateSupplier.get();
		System.out.println("systemDate->" + systemDate);

	}

	static void printNames(Supplier<String> arg) {
		System.out.println(arg.get());
	}

	public static Date getSystemDate() {
		return new Date();
	}

}

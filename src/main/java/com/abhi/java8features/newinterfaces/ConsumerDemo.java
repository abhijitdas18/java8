package com.abhi.java8features.newinterfaces;

import java.util.function.Consumer;

// java.util.function.Consumer is a functional interface.
// a Consumer acts upon a value but returns nothing.
//abstract functional method accept(T t), does not return any value making it a void method
//  default method andThen(Consumer<? super T> after)
public class ConsumerDemo {

	public static void main(String[] args)
	{
		////////////// EX 01 ///////////////////////
		Consumer <String> consumer01 = (arg) -> {
			System.out.println(arg + " OK ");
		};
		consumer01.accept("Test Consumer accept -----");
		
		Consumer <String> consumer02 = (arg) -> {
			System.out.println(arg + "OK !!!");
		};
		//andThen() is a default method of the functional Interface
		consumer01.andThen(consumer02).accept("Test Consumer after then------");	
		
		
		///////////////EX 02 //////////////////////
		// This consumer calls a void method with the value.
        Consumer<Integer> consumer03 = x -> display(x - 1);

        // Use the consumer with three numbers.
        consumer03.accept(1);
        consumer03.accept(2);
        ///////////// EX 03 ///////////////////
        Consumer<String> consumer04 = s ->  printNames(s);     
        
        consumer04.accept("Jeremy");
        consumer04.accept("Paul");

        Consumer<String> consumer05 = ConsumerDemo ::  printNames;        
        consumer05.accept("Jeremy");
        consumer05.accept("Paul");

	}
	
	static void display(int value) {

        switch (value) {
        case 1:
            System.out.println("There is 1 value");
            return;
        default:
            System.out.println("There are " + Integer.toString(value)
                    + " values");
            return;
        }
	}
	
	
	private static void printNames(String name) {
        System.out.println(name);
    }
	
	

}

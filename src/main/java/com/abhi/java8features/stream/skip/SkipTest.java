package com.abhi.java8features.stream.skip;

import java.util.stream.Stream;

//  intermediate operation that discards the first n elements of a stream.
//  if it's higher than the size of the stream, skip() returns an empty stream.
//  The skip() operation has to keep the state of the elements seen at each moment.
//  For this reason, we say that skip() is a stateful operation.
public class SkipTest {
    public static void main(String[] args) {

        System.out.println("Even numbers 1 -10 :");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter( i -> i % 2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nEven numbers 1 -10  with skip 3 :");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter( i -> i % 2 == 0)
                .skip(3)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nEven numbers 1 -10  with skip 10 :");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter( i -> i % 2 == 0)
                .skip(10)
                .forEach(x -> System.out.print(x + " "));
    }
}

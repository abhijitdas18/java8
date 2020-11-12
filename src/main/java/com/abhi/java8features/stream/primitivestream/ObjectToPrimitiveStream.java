package com.abhi.java8features.stream.primitivestream;

import java.util.stream.Stream;

public class ObjectToPrimitiveStream {
    public static void main(String[] args) {

        System.out.println("Only trailing integers : ");
        Stream.of("a123","b456","c345","d234")
                .map(x -> x.substring(1,4))
                .mapToInt(Integer::parseInt)
                .forEach(x -> System.out.print(x + " ") );

        System.out.println("\nMax of the numbers : ");
        Stream.of("a123","b456","c345","d234")
                .map(x -> x.substring(1,4))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out :: print);
    }
}

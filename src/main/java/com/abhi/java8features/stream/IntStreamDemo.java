package com.abhi.java8features.stream;

import java.util.stream.IntStream;

// IntStream - IntStream range(int startInclusive, int endExclusive) returns a sequential ordered IntStream
// from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
public class IntStreamDemo {
    public static void main(String [] ar) {

        System.out.println("Display 1 to 5(exclusive) :");
        IntStream.range(1,5).forEach(s-> System.out.print(s));

        //sum of int from 1 - 5 (1 + 2+ 3+ 4)
        System.out.println("\nSum: "+ IntStream.range(1,5).sum());

        //OptionalInt
        System.out.println("Max:" + IntStream.range(1,5).max());


    }
}

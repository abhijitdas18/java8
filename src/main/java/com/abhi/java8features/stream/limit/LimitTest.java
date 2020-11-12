package com.abhi.java8features.stream.limit;

//  intermediate operation that returns a stream not longer than the requested size.
//  limit() is also a stateful operation since it has to keep the
//  state of the items that are being picked up.
//  But unlike skip(), which consumes the entire stream, as soon as limit() reaches
//  the maximum number of items, it doesn't consume any more items and simply returns
//  the resulting stream. Hence, we say that limit() is a short-circuiting operation.
import java.util.stream.Stream;

public class LimitTest {

    public static void main(String[] args) {

        System.out.println("Even numbers 1 -10 :");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter( i -> i % 2 == 0)
                .forEach(x -> System.out.println(x));

        System.out.println("Even numbers 1 -10  with limit 3 :");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter( i -> i % 2 == 0)
                .limit(3)
                .forEach(x -> System.out.println(x));
    }
}

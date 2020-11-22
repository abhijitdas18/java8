package com.abhi.java8features.optional;

import java.util.ArrayList;
import java.util.Optional;

// Optional : used to contain not-null objects.
// Optional object is used to represent null with absent value.
public class OptionalTest {

    public static void main(String[] args) {

        // Declaring Optional Object
        Optional<String> value = Optional.empty();


        // without Optional Class
        String[] words = new String[10];
        //String word = words[5].toLowerCase();
        //System.out.print(word);

        // With Optional
        Optional<String> checkNull =
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word01 = words[5].toLowerCase();
            System.out.print(word01);
        } else
            System.out.println("word is null");


    }
}


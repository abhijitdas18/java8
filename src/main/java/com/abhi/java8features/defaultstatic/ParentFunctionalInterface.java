package com.abhi.java8features.defaultstatic;


public interface ParentFunctionalInterface {
    default void show() {
        System.out.println("I am in ParentFunctionalInterface");
    }
}

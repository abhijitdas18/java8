package com.abhi.java8features.defaultstatic;


public interface ParentFunctionalInterface02 {
    default void show() {
        System.out.println("I am in ParentFunctionalInterface-show()");
    }
    default void display() {
        System.out.println("I am in ParentFunctionalInterface-display()");
    }
}

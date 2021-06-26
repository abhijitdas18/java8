package com.abhi.java8features.defaultstatic;

@FunctionalInterface
public interface FunctionalInterface03 {
    void show();
    default void display(){

    }
// Can not override Object class methods
//    default String toString(){
//
//    }

    // If an interface declares an abstract method overriding one of the public methods of java.lang.Object,
    // that also does not count toward the interface’s abstract method count since any
    // implementation of the interface will have an implementation from java.lang.Object
     public String toString(); // It is allowed, Overridden from Object class

    //String func(); // It is not allowed. Only one abstract method
}

package com.abhi.java8features.defaultstatic;

@FunctionalInterface
public interface FunctionalInterface04 {

    void func();
    default void show() {
        System.out.println("This is from FunctionalInterface04 - show()");
    }
}

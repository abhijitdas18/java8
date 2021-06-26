package com.abhi.java8features.defaultstatic;

public class StaticTest05 implements FunctionalInterface05 {

    //@Override
    public void show() {
        System.out.println("StaticTest05-show()");
    }

    //@Override
    public static void display() {
        System.out.println("StaticTest05-display() a static method in StaticTest05");
    }

    public static void main(String[] args) {
        FunctionalInterface05.display();
        StaticTest05.display();


    }
}

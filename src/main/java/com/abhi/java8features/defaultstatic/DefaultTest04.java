package com.abhi.java8features.defaultstatic;

public class DefaultTest04 implements  FunctionalInterface04{
    public void func(){
        System.out.println("DefaultTest04 - func()");
    }

    public static void main(String[] args) {
        DefaultTest04 dt = new DefaultTest04();
        dt.func();
        dt.show(); // If show() is not override in DefaultTest04, o/p is This is from FunctionalInterface04 - show()
    }

    // Default interface methods can be overwritten in classes implementing the interface and
    // the class implementation of the method has a higher precedence than the interface implementation,
    // even if the method is implemented in a superclass.
    @Override
    public void show() {
        System.out.println("DefaultTest04 - show(), override default method");
    }
}

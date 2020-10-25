package com.abhi.java8features.newinterfaces;
//In Java 8 a Function Descriptor is a term used to describe the signature of the abstract method of a Functional Interface.
//The signature of the abstract method of a Functional Interface is syntactically the same as the signature of the Lambda Expression.
//Hence, a Function Descriptor also describes the signature of a lambda.
public interface MyFunctionalInterface 
{

}


//EX00
@FunctionalInterface
interface FirstInterface0
{
//the signature of the abstract method OR the function descriptor is () -> void
public void noArgMethod();
}

//EX01
@FunctionalInterface
interface FirstInterface
{
//the signature of the abstract method OR the function descriptor is (String) -> void
  public void singleMethod(String param);
}

//EX02
@FunctionalInterface
interface SecondInterface 
{
 //the function descriptor is (int,int) -> long
  public long computeSum(int num1, int num2);
}

//EX03
@FunctionalInterface
interface Function<T, R> {
    /**
     * The function descriptor for Function<T, R> will be T -> R
     * Applies this function to the given argument.
     * @param t the function argument
     * @return the function result of type R
     */
    R apply(T t);
}
package org.example.functional;

import java.util.Enumeration;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int incrementFromFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementFromFunction);

        int multipliedBy10 = multiplyBy10Function.apply(1);
        System.out.println(multipliedBy10);

        int addAndMultuply = addAndMultiplyFunction.apply(5);
        System.out.println(addAndMultuply);

        int n = addByOneAndMultiplyByNumber(1,100);
        System.out.println(n);

        int resultOfBiFunction = addByOneAndMultiplyByFunction.apply(1,100);
        System.out.println(resultOfBiFunction);

    }

    static Integer incrementByOne(Integer n){
        return n+1;
    }

    static Integer addByOneAndMultiplyByNumber(int n1,int n2){
        return (n1+1)*n2;
    }

    // Function <Input Type, Output Type> function name = either lamda expression or chaining of Function methods using andThen
    // Function takes 1 input and produces 1 output
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;
    static Function<Integer,Integer> addAndMultiplyFunction = incrementByOneFunction.andThen(multiplyBy10Function);

    // BiFunction takes 2 inputs and produces 1 output
    static BiFunction<Integer, Integer, Integer> addByOneAndMultiplyByFunction = (n1,n2) -> (n1+1)*n2;

}

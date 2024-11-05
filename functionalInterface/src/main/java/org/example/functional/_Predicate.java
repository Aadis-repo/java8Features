package org.example.functional;

import jdk.jshell.spi.SPIResolutionException;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("with method");
        System.out.println(isValidPhoneNumber("9987481441"));
        System.out.println(isValidPhoneNumber("8987481441"));
        System.out.println("with predicate");
        // predicate uses test() to call the lambda expression
        System.out.println(isValidPhoneNumberPredicate.test("9987481441"));
        System.out.println(isValidPhoneNumberPredicate.test("8987481441"));
        System.out.println("is number valid and contains 8");
        // predicates can be combined like and or. multiple predicates can be chained as well
        System.out.println(isValidPhoneNumberPredicate.and(contains8).and(contains7).test("9987481441"));
        System.out.println(isValidPhoneNumberPredicate.and(contains8).and(contains7).test("8987481441"));
        System.out.println(isValidPhoneNumberPredicate.and(contains8).or(contains7).test("9986481441"));
        System.out.println("using bi predicate");
        System.out.println(nameAndPhone.test("aditya","9987481441"));
    }

    static boolean isValidPhoneNumber(String ph){
        return ph.startsWith("9") && ph.length() == 10;
    }

    // Predicate is single input functional interface which returns a boolean value
    static Predicate<String> isValidPhoneNumberPredicate = ph -> ph.startsWith("9") && ph.length() == 10;

    static Predicate<String> contains8 = ph -> ph.contains("8");
    static Predicate<String> contains7 = ph -> ph.contains("7");

    // Bi-Predicate is Dual input functional interface which returns a boolean value
    static BiPredicate<String,String> nameAndPhone = (name,ph) -> name.startsWith("a") && ph.startsWith("9");

}

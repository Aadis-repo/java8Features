package org.example.functional;

import javax.xml.namespace.QName;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("aditya","91234567890"));
        // Consumer uses accept() to call the lambda expression
        greetCustomerConsumer.accept(new Customer("aditya","91234567890"));
        greetCustomerV2Consumer.accept(new Customer("aditya","91234567890"),false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hi "+customer.name+", thanks for registering with phone number: "+customer.ph);
    }
    // Consumer is a functional interface which does not return a result, it is like a void method which accepts only 1 input
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hi "+customer.name+", thanks for registering with phone number: "+customer.ph);

    // BiConsumer is a functional interface which accepts two inputs and does not produce a result, void method with two inputs
    static BiConsumer<Customer,Boolean> greetCustomerV2Consumer = ((customer, aBoolean) ->
            System.out.println("Hi "+customer.name+", thanks for registering with phone number: "+(aBoolean ? customer.ph : "***********")));
    static class Customer {
        private String name;
        private String ph;

        public Customer(String name,String ph){
            this.name = name;
            this.ph = ph;
        }
    }
}

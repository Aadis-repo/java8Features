package org.example.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("aditya", Gender.MALE),
                new Person("manasi", FEMALE),
                new Person("Apurva", FEMALE),
                new Person("Rajni", FEMALE),
                new Person("Arun",Gender.MALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person person: females){
            System.out.println(person);
        }

        List<Person> female2 = people.stream().filter(person -> FEMALE.equals(person.gender)).toList();
        female2.forEach(System.out::println);
    }

    static class Person{
        private String name;
        private Gender gender;

        public Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}

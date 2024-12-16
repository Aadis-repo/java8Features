package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    // NOTE: Reduce is not covered under this tutorial, please cover it separately
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("aditya");
        myList.add("sharma");
        myList.add("aman");
        myList.add("kumar");
        myList.add("singh");
        // **************************************************

        /*
        1. filter(predicate)
        It accepts a boolean valued function. which means it takes a predicate as an input and based on that it filters the collection
        - filter(e-> e%2==0) if predicate is single line only, no need to include return statement
        - filter(e-> {}) if predicate is multiline, then we need to include return statement inside
         */

        /*
        2. map(Function)
        It accepts a Function. Meaning, If processing is required or changes are required on each element then we use map 
         */
        List<Integer> numList = List.of(7,6,5,4,3,2,1);
        List<Integer> newList = numList.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newList);
        List<String> newWordList = myList.stream().filter(e->e.contains("a")).collect(Collectors.toList());
        System.out.println(newWordList);
        List<String> newWordAddList = myList.stream().map(e-> e +" sharma").collect(Collectors.toList());
        System.out.println(newWordAddList);
        List<String> newWordSubList = myList.stream().map(e-> e.substring(0,3)).collect(Collectors.toList());
        System.out.println(newWordSubList);

        List<Integer> sortedList = numList.stream().sorted().toList();
        System.out.println(sortedList);
        List<Integer> distinctList = numList.stream().distinct().toList();
        System.out.println(distinctList);
        numList.stream().sorted().forEach(System.out::print);


    }
}

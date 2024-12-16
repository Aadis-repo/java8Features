package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(4);
        numlist.add(5);

        List<Integer> newlist = numlist.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(numlist);
        System.out.println(newlist);
        List<Integer> tlist = numlist.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(tlist);
        // normal arr with stream
        int[] arr = {1,2,3,4,5};
//        Arrays.stream(arr).filter();
        // create stream object for normal array
        String[] stringarr = {"aditya","sharma","I","am","batman"};
        Stream<String> stream = Stream.of(stringarr);


     }
}

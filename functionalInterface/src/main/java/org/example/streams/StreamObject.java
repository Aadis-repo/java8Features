package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//    Arrays.stream(arr);
        // create stream object for normal array
        String[] stringarr = {"aditya","sharma","I","am","batman"};
        // 1
        Arrays.stream(stringarr);
        // 2
        Stream<String> stream = Stream.of(stringarr);
        // 3
        Stream<Object> stringStream = Stream.builder().build();
        // 4, anonymous array
        IntStream stream1 = Arrays.stream(new int[]{1,2,3,4,5,6});
        // 5, List or set or any collection
        List<String> list = new ArrayList<>();
        list.add("aditya");
        Stream<String> mystream =  list.stream();
        mystream.forEach(System.out::println);

    }
}

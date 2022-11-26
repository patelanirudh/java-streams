package com.learn.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerStreams {

    public static void main(String[] args) {
        IntStream.range(1, 10) // 10 is not included
                .skip(2)
                .forEach(System.out::println);

        int sum = IntStream.range(1, 10)
                .sum(); // terminal operation
        System.out.println("Sum of integer streams [1-10] " + sum);

        System.out.println("Average of int array as streams");
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

    }
}

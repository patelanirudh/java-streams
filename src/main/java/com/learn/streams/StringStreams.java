package com.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringStreams {

    public static void main(String[] args) {
        Stream.of("Shweta", "Anirudh", "Shiuli", "Shilpi", "Papa")
                .sorted()
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Did not find any"));

        String[] names = {"Shweta", "Anirudh", "Shiuli", "Shilpi", "Papa"};
        Arrays.stream(names)
                .filter(s -> s.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("Print items starts with \"a\"");
        List<String> people = Arrays.asList("Shweta", "Anirudh", "Shiuli", "Shilpi", "Papa");
        people.stream()
                .map(String::toLowerCase) // s -> s.toLowerCase
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }
}

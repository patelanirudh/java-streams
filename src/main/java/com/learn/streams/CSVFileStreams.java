package com.learn.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVFileStreams {

    public static void main(String[] args) throws IOException {
        String fileName = "csvFile.txt";
        System.out.println(Paths.get("./resources/csvFile.txt").toAbsolutePath().toString());
        Stream<String> rows1 = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("csvFile.txt"))).lines();
        // rows1.forEach(System.out::println);

        int rowCount = (int) rows1
                .map(l -> l.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        // Filter rows from CSVFile and store it in HashMap
        System.out.println("Filter rows from CSVFile and store it in HashMap");
        Stream<String> rows2 = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("csvFile.txt"))).lines();
        Map<String, Integer> collectedMap = rows2.map(l -> l.split(","))
                .filter(l -> l.length == 3)
                .filter(l -> Integer.parseInt(l[1]) > 15)
                .collect(Collectors.toMap(
                        l -> l[0],
                        l -> Integer.parseInt(l[1])));

        collectedMap.forEach((k,v) -> System.out.println("Key " + k + ", Value " + v));

    }
}

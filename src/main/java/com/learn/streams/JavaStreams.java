package com.learn.streams;

/*
    A stream pipeline consists of a source, followed by zero or more intermediate operations
    and a terminal operation
    Source -> Filter -> Sort -> Map -> Collect/Reduce ->
    1. Source = Collections, Lists, Sets, ints, longs, doubles, arrays, lines of file
    2. Intermediate Ops = Filter, Map, Sort, find(X), skip, flatMap return a stream so we chain multiple
                           intermediate operations
    3. Terminal Ops = forEach, collect, count/min/reduce are either void or return a non-stream result

    Order Matters for large datasets: filter first, then sort or map
    For very large datasets use ParallelStream to enable multiple threads
 */

public class JavaStreams {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}
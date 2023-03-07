package com.venkat.java.lambda.LambdaProj1.interview;

import java.util.Date;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        long end = System.currentTimeMillis();
//        System.out.println("Sequencial stream time taken : " + (end-start));

        System.out.println("===================================");

        long start2 = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        long end2 = System.currentTimeMillis();
        System.out.println("Sequencial stream time taken : " + (end-start));
        System.out.println("Parallel stream time taken : " + (end2-start2));
    }
}

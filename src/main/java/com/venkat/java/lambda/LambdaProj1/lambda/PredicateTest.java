package com.venkat.java.lambda.LambdaProj1.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> predicate = (p) -> p > 10;
        System.out.println("Predicate :" + predicate.test(12));
        List<Integer> integers = Arrays.asList(9, 10, 12, 14, 15, 16);
        System.out.println("Predicate ::" + integers.stream().filter(predicate).collect(Collectors.toList()));
        System.out.println("Interview ::" + integers.stream().filter(t -> t > 10).map(t -> t + 1).collect(Collectors.toList()));
    }
}
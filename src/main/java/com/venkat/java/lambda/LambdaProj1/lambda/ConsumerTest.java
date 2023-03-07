package com.venkat.java.lambda.LambdaProj1.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        //Consumer
        Consumer<String> consumer = t -> System.out.println("Print string :" + t);

        List<String> strings = Arrays.asList("A", "B", "C");
        strings.stream().forEach(consumer);
        strings.stream().forEach(t -> System.out.println("Print :" + t));
    }
}

package com.venkat.java.lambda.LambdaProj1.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        //Supplier
        Supplier<String> supplier = () -> "hi";
        System.out.println("Supplier : " + supplier.get());
        List<String> strings = Arrays.asList("Thanks", "");
        System.out.println("Supplier :: " + strings.stream().findAny().orElseGet(supplier));
        List<String> strings1 = Arrays.asList(); // not array list to it will go to orElseGet
        System.out.println("Supplier1 :: " + strings1.stream().findAny().orElseGet(supplier));
    }
}

package com.venkat.java.lambda.LambdaProj1.interview;

import com.venkat.java.lambda.LambdaProj1.interview.util.Employee;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //empty
        System.out.println(Optional.empty());

        //of
        Employee emp = new Employee(23, 3000, null, Arrays.asList(23, 234));
//        System.out.println("of : " + Optional.of(emp.getName()));

        //ofNullable

        System.out.println("ofNullable : " + Optional.ofNullable(emp.getName()).map(s -> s.toUpperCase()));
        System.out.println("Default value  : " + Optional.ofNullable(emp.getName()).map(s -> s.toUpperCase()).orElse("Else defaultName"));
        System.out.println("Default value  : " + Optional.ofNullable(emp.getName()).orElseGet(()->"ElseGet defaultName"));
        System.out.println("Default value  : " + Optional.ofNullable(emp.getName()).orElseGet(()->"ElseGet defaultName"));
    }
}

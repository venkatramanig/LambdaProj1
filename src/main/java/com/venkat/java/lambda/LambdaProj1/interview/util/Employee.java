package com.venkat.java.lambda.LambdaProj1.interview.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>{
    private Integer age; // Integer implements Comparable
    private int salary;
    private String name;
    private List<Integer> phone;

    @Override
    public int compareTo(Employee o) {
        return getAge().compareTo(o.getAge());
    }
}

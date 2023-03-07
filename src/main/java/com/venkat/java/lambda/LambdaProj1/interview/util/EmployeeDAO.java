package com.venkat.java.lambda.LambdaProj1.interview.util;

import java.util.*;

public class EmployeeDAO {

    public List<Employee> getEmployee(){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(23, 3000, "Hari", Arrays.asList(23, 234)));
        emp.add(new Employee(32, 6000, "Amar", Arrays.asList(33, 1234)));
        emp.add(new Employee(12, 12000, "Venkat", Arrays.asList(12, 1234)));
        emp.add(new Employee(45, 15000, "Giri", Arrays.asList(45, 1234)));

        return emp;
    }

    public Map<Integer, Employee> getEmpMap(){
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee(23, 3000, "Hari 3", Arrays.asList(123, 1234)));
        empMap.put(2, new Employee(32, 4000, "Hari 4", Arrays.asList(123, 1234)));
        empMap.put(3, new Employee(12, 5000, "Hari 5", Arrays.asList(123, 1234)));
        empMap.put(4, new Employee(28, 6000, "Hari 6", Arrays.asList(123, 1234)));
        empMap.put(5, new Employee(27, 7000, "Hari 7", Arrays.asList(123, 1234)));

        return empMap;
    }
}

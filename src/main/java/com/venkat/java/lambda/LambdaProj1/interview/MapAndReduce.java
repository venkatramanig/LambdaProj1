package com.venkat.java.lambda.LambdaProj1.interview;

import com.venkat.java.lambda.LambdaProj1.interview.util.Employee;
import com.venkat.java.lambda.LambdaProj1.interview.util.EmployeeDAO;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3, 4, 16, 5, 2, 4);
        int sum = num.stream().mapToInt(i->i).sum();
        System.out.println("Sum : " + sum);

        //Reduce method
        Integer reduce = num.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Reduce sum : " + reduce);

        System.out.println("Case 2 :" + num.stream().reduce(Integer::sum));

        System.out.println("Max :" + num.stream().reduce((a,b) -> a>b?a:b));

        //Averate salary of emp whose age is greater than 25
        //filter age >25
        //data map their salary
        //reduce to find their average
        EmployeeDAO emp = new EmployeeDAO();
        List<Employee> empList = emp.getEmployee();
        System.out.println("Average Salaray :: " +
                empList.stream()
                .filter(e -> e.getAge()>25)
                .map(e -> e.getSalary())
                .mapToInt(i->i)
                .average().getAsDouble());

    }
}

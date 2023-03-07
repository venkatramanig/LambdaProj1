package com.venkat.java.lambda.LambdaProj1.interview;

import com.venkat.java.lambda.LambdaProj1.interview.util.Employee;
import com.venkat.java.lambda.LambdaProj1.interview.util.EmployeeDAO;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFlatMap {
    public static void main(String[] args) {
        System.out.println("\n**********************************************************************************");
        //map vs flatMap is used for Data Transformation
        EmployeeDAO emp = new EmployeeDAO();
        List<Employee> empList = emp.getEmployee();

        //Function chaining
        System.out.println("*******Function chaining************");
        Function<String, Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;
        Function<Integer, Integer> func3 = x -> x * 2;

        Integer result = func1.andThen(func2.andThen(func3)).apply("venkat");//24
        System.out.println(result);

        //Function
        Function<String, Integer> func = (s) -> s.length();
        System.out.println("func.apply : " + func.apply("Hello"));
        System.out.println("Lambda function chaining : " + empList.stream().map(e -> func1.andThen(func2.andThen(func3)).apply(e.getName())).collect(Collectors.toList()));

       /* //Function
        Function<String, Integer> func1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(func.apply("Hello"));*/

        System.out.println("Length of emp Names : " + empList.stream().map(e -> e.getName().length()).collect(Collectors.toList()));
        //1 map Data transformation fetch all names
        System.out.println("Only emp Names : " + empList.stream().map(Employee::getName).collect(Collectors.toList()));

        //2 flatMap get all the phone numbers
        // one to many
        System.out.println("All phone numbers as ListOfList: " + empList.stream().map(e -> e.getPhone()).collect(Collectors.toList()));

        System.out.println("All phone numbers as ListOfList age > 24: " + empList.stream().filter(e -> e.getAge()>24).flatMap(e -> e.getPhone().stream()).collect(Collectors.toList()));
        System.out.println("All phone numbers flatMap: " + empList.stream().flatMap(e -> e.getPhone().stream()).collect(Collectors.toList()));





    }
}

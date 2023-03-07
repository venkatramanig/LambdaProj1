package com.venkat.java.lambda.LambdaProj1.interview;

import com.venkat.java.lambda.LambdaProj1.interview.util.Employee;
import com.venkat.java.lambda.LambdaProj1.interview.util.EmployeeDAO;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQ {

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> emps = dao.getEmployee();

        //Q1 : Emp name whose sal is greated than 3000
        List<String> names = emps.stream().filter(e -> e.getSalary()>3000).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("Names : " + names);

        //Q2 :  Sort a list
        //1
        System.out.println("\n111111111111111111");
        System.out.println("Sorter Emp  :: " + emps.stream().sorted().collect(Collectors.toList()));

        //2
        System.out.println("\n22222222222222222222");
        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("Traditional : " + emps);

        //3
        System.out.println("\n33333333333333333333");
        Collections.sort(emps, (o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println("Traditional reverse sort : " + emps);

        //4  forEach(System.out::println) ---> Method Reference
        System.out.println("\n44444444444444444444");
        System.out.println("Custom Sorted : " +  emps.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList()));

        //5
        System.out.println("\n5555555555555555");
        emps.forEach(System.out::println);
        emps.stream().sorted(Comparator.comparing(e -> e.getAge())).forEach(e -> System.out.println("5" +e));

        //6
        //sort a map have key or value a custome object
        System.out.println("\n6666666666666666");
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee(23, 3000, "Hari 3", Arrays.asList(123, 1234)));
        empMap.put(2, new Employee(32, 4000, "Hari 4", Arrays.asList(123, 1234)));
        empMap.put(3, new Employee(12, 5000, "Hari 5", Arrays.asList(123, 1234)));
        empMap.put(4, new Employee(28, 6000, "Hari 6", Arrays.asList(123, 1234)));
        empMap.put(5, new Employee(27, 7000, "Hari 7", Arrays.asList(123, 1234)));

        empMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAge))).forEach(System.out::println);


        //7
        System.out.println("\n77777777777");
        List<Integer> intlist = Arrays.asList(54,67,76,87,12,23,34,45,56,67,78);
        System.out.println("Sorted Using lambda : " + intlist.stream().sorted().collect(Collectors.toList()));
        System.out.println("Reverse sorted Using lambda : " + intlist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
        Collections.reverse(intlist);
        System.out.println("Reversed  : " + intlist);
        Collections.sort(intlist);
        System.out.println("Sorted  : " + intlist);

    }
}

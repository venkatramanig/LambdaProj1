package com.venkat.java.lambda.LambdaProj1.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        //Consumer
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        //Consumer forEach()
        map.forEach((k,v) -> System.out.println("::::" + k + " : " + v));
        map.entrySet().forEach(e -> System.out.println("K :"+e.getKey() + " : "+"V : "+ e.getValue()));

        //Predicate filter()
        map.entrySet().stream().filter(m -> m.getKey()>2).forEach(e -> System.out.println(e));

        //Supplier orElseThrow()
//      map.entrySet().stream().filter(m -> m.getKey()>4).findAny().orElseThrow(()-> new RuntimeException("No valid map found...."));

    }
}

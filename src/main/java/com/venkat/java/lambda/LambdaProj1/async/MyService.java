package com.venkat.java.lambda.LambdaProj1.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.val;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class MyService {

    @Autowired
    private Client1 client1;
    @Autowired
    private Client2 client2;
    @Autowired
    private Client3 client3;


    public String getString() throws ExecutionException, InterruptedException {
        System.out.println("Started Main :::");
        long start = System.currentTimeMillis();
        CompletableFuture<String> s1 = client1.get1();
        System.out.println("1");
        CompletableFuture<String> s2 = client2.get2();
        CompletableFuture<String> str = client3.doStuff(s2.get()); //this will block further execution as s2 has to complete so its value can be sent as parameter
        System.out.println("2");
        CompletableFuture<String> s3 = client1.get1();
        System.out.println("3");
        CompletableFuture<String> s4 = client2.get2();
        System.out.println("4");
        CompletableFuture<String> s5 = client1.get1();
        System.out.println("5");
        CompletableFuture<String> s6 = client2.get2();
        System.out.println("6");

        System.out.println("Ended Main ::::");

        long end = System.currentTimeMillis();
        System.out.println("Total time  :" + (end - start));

        System.out.println("Before C :::");
        System.out.println("C ::" + s3.get());
        System.out.println("After C :::");
        CompletableFuture.allOf(s1,s2).join(); //this will block further execution until s1, s2 is completed
        System.out.println("::::");
        String a = s1.get();
        String b = s2.get();

        System.out.println("Completed");

        return (a + b + str.get());
    }



}

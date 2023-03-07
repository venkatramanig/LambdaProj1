package com.venkat.java.lambda.LambdaProj1.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

@Service
public class Client1 {

    @Async("asyncTask")
    public CompletableFuture<String> get1(){
        try {
            System.out.println("get1 T name: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("get1 finished: " + System.currentTimeMillis());
            CompletableFuture<String> a = new CompletableFuture<>();
            a.complete("Hi ");
            return a;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

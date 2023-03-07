package com.venkat.java.lambda.LambdaProj1.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class Client2 {

    @Async("asyncTask")
    public CompletableFuture<String> get2(){
        try {
            System.out.println("get2 : " + System.currentTimeMillis());
            System.out.println("get2 T name: " + Thread.currentThread().getName());
            Thread.sleep(20000);
            System.out.println("get2 finished: " + System.currentTimeMillis());
            CompletableFuture<String> a = new CompletableFuture<>();
            a.complete("World!!!!!!!!");
            return a;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

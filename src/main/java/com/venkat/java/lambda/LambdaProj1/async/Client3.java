package com.venkat.java.lambda.LambdaProj1.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class Client3 {

    @Async("asyncTask")
    public CompletableFuture<String> doStuff(String str){
        try {
            Thread.sleep(5000);
            CompletableFuture<String> a = new CompletableFuture<>();
            a.complete(str + str + str);
            return a;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.venkat.java.lambda.LambdaProj1.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class HelloWorldController {

    @Autowired
    private MyService myService;
    @GetMapping(path = "/hi")
    String getString(){
        try {
            return myService.getString();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

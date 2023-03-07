package com.venkat.java.lambda.LambdaProj1.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hi")
    public String hi(){
        return "Hi";
    }

}

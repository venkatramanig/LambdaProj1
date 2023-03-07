package com.venkat.java.lambda.LambdaProj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync // this will inform spring to run threads in background if the method is @Async
public class LambdaProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(LambdaProj1Application.class, args);
	}

}

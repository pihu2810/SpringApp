package com.example.greetingmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingMessageApplication {

    public static void main(String[] args) {
        System.out.print("hello");
        SpringApplication.run(GreetingMessageApplication.class, args);
    }

}

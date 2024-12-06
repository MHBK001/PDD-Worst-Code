package com.pain.pdd.pdddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheApplicationThatStartsEverything {

    public static void main(String[] args) {
        System.out.println("App starting... maybe?");
        SpringApplication.run(TheApplicationThatStartsEverything.class, args);
        System.out.println("App started! Or did it?");
    }
}


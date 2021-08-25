package com.borisov.springdestroyer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class SpringDestroyerApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("com.borisov.springdestroyer");
        System.out.println("Hello");
    }
}

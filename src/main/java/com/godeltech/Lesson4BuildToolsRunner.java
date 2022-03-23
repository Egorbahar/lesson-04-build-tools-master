package com.godeltech;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(scanBasePackages = {"com.godeltech"})
public class Lesson4BuildToolsRunner {
    public static void main(final String[] args) {
        run(Lesson4BuildToolsRunner.class, args);
    }
}

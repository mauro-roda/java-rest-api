package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public static class CalculatorController {

        @GetMapping("/sum/{num1}/{num2}")
        public String getSum(@PathVariable int num1, @PathVariable int num2) {
            int sum = num1 + num2;
            return "Sum of " + num1 + " and " + num2 + " is: " + sum;
        }
    }
}

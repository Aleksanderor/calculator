package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator calculator1 = new Calculator();

        System.out.println(calculator1.addAToB(5,5));
        System.out.println(calculator1.subtractAFromB(19,10));

        //calculator1.addAToB(5, 5);


    }
}

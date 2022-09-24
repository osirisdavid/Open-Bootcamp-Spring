package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CalculatorService calculator = (CalculatorService)context.getBean("calculatorService");

        String text = calculator.holaMundo();
        System.out.println(text);

        CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");
        String text2 = calculatorService.holaMundo();
        System.out.println(text2);
    }
}

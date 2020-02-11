package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    private Display display;

    public double add(double number1, double number2) {
        double outcome = number1 + number2;
        System.out.println("Add" + ": " + number1 + " + " + number2 + ";");
        display.displayValue(outcome);
        return outcome;
    }

    public double sub(double number1, double number2) {
        double outcome = number1 - number2;
        System.out.println("Subtract: " + number1 + " - " + number2 + ";");
        display.displayValue(outcome);
        return outcome;
    }

    public double mul(double number1, double number2) {
        double outcome = number1 * number2;
        System.out.println("Multiply: " + number1 + " * " + number2 + ";");
        display.displayValue(outcome);
        return outcome;
    }

    public double div(double number1, double number2) {
        double outcome = number1 / number2;
        System.out.println("Divide: " + number1 + " / " + number2 + ";");
        display.displayValue(outcome);
        return outcome;
    }
}

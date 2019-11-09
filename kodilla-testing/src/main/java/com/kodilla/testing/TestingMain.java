package com.kodilla.testing;

import calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int sum = calculator.add(2,3);
        int product = calculator.subtract(2,3);
        if (sum == 5) {
            System.out.println("Test add() OK");
        } else {
            System.out.println("Error Test add()");
        }
        if(product == -1) {
            System.out.println("Test subtract() OK");
        } else {
            System.out.println("Error Test subtract()");
        }
    }
}

package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculatorAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double outcome = calculator.add(6.2, 5.1);
        //Then
        Assert.assertEquals(11.3, outcome, 0.01);
    }

    @Test
    public void testCalculatorSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double outcome = calculator.sub(5.1, 6.2);
        //Then
        Assert.assertEquals(-1.1, outcome, 0.01);
    }

    @Test
    public void testCalculatorMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double outcome = calculator.mul(6.2, 2.0);
        //Then
        Assert.assertEquals(12.4, outcome, 0.01);
    }

    @Test
    public void testCalculatorDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double outcome = calculator.div(6.2, 2.0);
        //Then
        Assert.assertEquals(3.1, outcome, 0.01);
    }
}

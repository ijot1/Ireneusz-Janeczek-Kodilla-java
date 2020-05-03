package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), calculatedPrice);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza basic: crust, tomato sauce, mozzarella", description);
    }

    @Test
    public void testPizzaAnchoviesGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(20), calculatedPrice);
    }

    @Test
    public void testPizzaAnchoviesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza basic: crust, tomato sauce, mozzarella, anchovies", description);
    }

    @Test
    public void testPizzaWithAnchoviesOlivesGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(24), calculatedPrice);
    }

    @Test
    public void testPizzaWithAnchoviesOlivesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza basic: crust, tomato sauce, mozzarella, anchovies, olives", description);
    }

    @Test
    public void testPizzaMushroomsGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(30), calculatedPrice);
    }

    @Test
    public void testPizzaMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaAnchoviesDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza basic: crust, tomato sauce, mozzarella, anchovies, olives, mushrooms", description);
    }

    @Test
    public void testPizzaWithMeatGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        theOrder = new PizzaMeatDecorator(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(32), calculatedPrice);
    }

    @Test
    public void testPizzaWithMeatGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        theOrder = new PizzaMeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza basic: crust, tomato sauce, mozzarella, olives, mushrooms, meat", description);
    }
}

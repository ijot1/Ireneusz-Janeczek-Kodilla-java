package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(5.2);

        //When
        shapeCollector.addFigure(shape1);

        //Then
        String name = shapeCollector.getFigure(0).getShapeName();
        Assert.assertEquals(shape1.getShapeName(), name);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Triangle(2.3, 2.5, 3.6);
        shapeCollector.addFigure(shape1);

        //When
        shapeCollector.removeFigure(shape1);

        //Then
        int size = shapeCollector.getSizeOfShapesCollection();
        Assert.assertTrue(size == 0);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3.14);
        shapeCollector.addFigure(shape);

        //When
        Shape shape1 = shapeCollector.getFigure(0);

        //Then
        Assert.assertSame(shape, shape1);
    }
}

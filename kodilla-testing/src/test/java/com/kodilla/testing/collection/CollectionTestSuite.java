package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
       //Given
       ArrayList<Integer> emptyList = new ArrayList<>();

       //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        int size = exterminator.exterminate(emptyList).size();

       //Then
       Assert.assertTrue(size == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        int size = 2;
        ArrayList numList = new ArrayList<Integer>();
        for(int i = 0; i < size; i++) {
            numList.add(i);
        }

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        int outcomeSize  = exterminator.exterminate(numList).size();

        //Than
        Assert.assertTrue(outcomeSize == 1);
    }
}

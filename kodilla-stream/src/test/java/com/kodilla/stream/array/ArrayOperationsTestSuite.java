package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int tabSize = 20;
        double sum = 0;
        int[] numbers = new int[tabSize];
        for (int i = 0; i < tabSize; i++) {
            numbers[i] = (i + 1) * 3;
            sum += numbers[i];
        }

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        double funcAverage = sum/numbers.length;
        Assert.assertEquals(funcAverage, average, 0.001);
    }
}

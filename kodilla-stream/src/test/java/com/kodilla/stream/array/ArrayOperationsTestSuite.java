package com.kodilla.stream.array;

import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(int[] numbers) {

        //Given
        int tabSize = 20;
        numbers = new int[tabSize];
        for (int i = 0; i < tabSize; i++) {
            numbers[i] = (i + 1) * 3;
        }

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then

        double funcAverage = IntStream.range(0, numbers.length).sum()/numbers.length;

    }
}

package com.kodilla.stream.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        int elements = IntStream.range(0, numbers.length)
                .collect(Collectors.toList())
                .forEach(System.out::println(elements));
    }
}

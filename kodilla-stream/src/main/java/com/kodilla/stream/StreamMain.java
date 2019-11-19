package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

import java.util.concurrent.Executor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is lambda in action"));
    }
}

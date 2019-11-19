package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

import java.util.concurrent.Executor;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String str = "Działanie poszczególnych wywołań (czyli ich kod) określamy każdorazowo poprzez użycie wyrażenia lambda.";

        poemBeautifier.beautify(str, String::toUpperCase);
        poemBeautifier.beautify(str, PoemBeautifier::invertString);
        poemBeautifier.beautify(str, PoemBeautifier::replaceChar);
    }
}
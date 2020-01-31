package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(2.5, 1.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("I really throw exception!");
        } finally {
            System.out.println("I've checked whether I throw exception");
        }
    }
}

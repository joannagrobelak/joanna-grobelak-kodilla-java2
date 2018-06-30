package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 1.5);
        } catch (Exception e) {
            System.out.println("Oops! Invalid input values.");
        } finally {
            System.out.println("acceptable are the following floating-point values: " +
                    "x equal or more than 1.0 and less than 2.0 and y not equal to 1.5");
        }

    }

}

package com.bridgelabz.assignment;

public class FibonacciSeries
{
    public static void main(String[] args) {
        int n = 25;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

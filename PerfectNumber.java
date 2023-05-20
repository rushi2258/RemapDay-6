package com.bridgelabz.assignment;

public class PerfectNumber
{

        public static boolean isPerfectNumber(int number) {
            int sum = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            return sum == number;
        }

        public static void main(String[] args) {
            int number = 28;
            int sumOfDivisors = 0;

            System.out.print("Divisors of " + number + ": ");

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                    System.out.print(i + " ");
                }
            }

            System.out.println();

            if (isPerfectNumber(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }


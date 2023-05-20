package com.bridgelabz.assignment;

public class ReverseNumber
{
    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 6695274;
        int reversedNumber = reverse(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}

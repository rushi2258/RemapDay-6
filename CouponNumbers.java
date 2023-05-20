package com.bridgelabz.assignment;

import java.util.Random;

public class CouponNumbers
{


        public static int generateRandomNumber(int max) {
            Random random = new Random();
            return random.nextInt(max) + 1;
        }

        public static boolean isDistinct(int[] coupons, int randomNumber) {
            for (int coupon : coupons) {
                if (coupon == randomNumber) {
                    return false;
                }
            }
            return true;
        }

        public static int generateDistinctCoupons(int[] coupons) {
            int totalRandomNumbers = 0;

            while (true) {
                int randomNumber = generateRandomNumber(coupons.length);
                totalRandomNumbers++;

                if (isDistinct(coupons, randomNumber)) {
                    coupons[randomNumber - 1] = randomNumber;
                }

                boolean allDistinct = true;
                for (int coupon : coupons) {
                    if (coupon == 0) {
                        allDistinct = false;
                        break;
                    }
                }

                if (allDistinct) {
                    break;
                }
            }

            return totalRandomNumbers;
        }

        public static void main(String[] args) {
            int[] coupons = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int totalRandomNumbers = generateDistinctCoupons(coupons);

            System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
        }
    }
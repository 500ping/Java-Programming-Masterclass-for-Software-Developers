package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000, 2));

        //challenge
        for (int i = 2; i <= 8; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        System.out.println("----------------------------------");

        //challenge 2
        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        //challenge 3
        int count = 0;
        for (int i = 0; i < 50; i ++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 3) {
                    break;
                }
            }
        }

        System.out.println("------------------");

        //challenge 4
        count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                sum += i;

                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
        return false;
    }

    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Invalid Value");
        } else if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal");
        } else if (n1 != n2 && n2 != n3 && n1 != n3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (int) minutes / (365 * 24 * 60);
            long remainingMinutes = minutes % (365 * 24 * 60);
            long days = (int) remainingMinutes / (24 * 60);
            remainingMinutes = remainingMinutes % (24 * 60);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        return isTeen(n1) || isTeen(n2) || isTeen(n3);
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return ((int) (num1 * 1000)) == ((int) (num2 * 1000));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        // leap year check
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0);
    }

}

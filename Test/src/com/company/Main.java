package com.company;

import com.company.test1.Point;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(6, 5);
        System.out.println(p.distance());
        System.out.println(p.distance(new Point(3,1)));
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isOdd(int num) {
        if (num < 0 || num % 2 == 0) {
            return false;
        }

        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        if ( (month < 1 || month > 12) || (year < 1 || year > 9999) ) {
            return -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }

    public static void printNumberInWord(int num) {
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
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

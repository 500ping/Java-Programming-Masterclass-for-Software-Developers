package com.company;

import java.util.Scanner;

public class Challenge2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int limit = getInputInt("Enter limit:");

        int count = 1;
        int min = 0;
        int max = 0;

        while (count <= limit) {
            int input = getInputInt("Enter number #" + count + ":");
            if (count == 1) {
                min = input;
                max = input;
            } else {
                if (min > input) {
                    min = input;
                }
                if (max < input) {
                    max = input;
                }
            }
            count++;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public static int getInputInt(String message) {
        System.out.println(message);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                return input;
            } else {
                System.out.println("Invalid integer, enter again:");
            }
            scanner.nextLine();
        }
    }


}

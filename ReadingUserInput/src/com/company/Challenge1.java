package com.company;

import java.util.Scanner;

public class Challenge1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int count = 1;
//        int sum = 0;
//
//        while (count <= 10) {
//            System.out.print("Enter number " + count + ": ");
//
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                int inputNumber = scanner.nextInt();
//                sum += inputNumber;
//                count++;
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine();
//        }
//
//        System.out.println("Sum = " + sum);
//        scanner.close();

        System.out.println(getInputInt("Enter an integer:"));
    }

    public static int getInputInt(String message) {
        System.out.println(message);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
//                scanner.close();
                return input;
            } else {
                System.out.println("Invalid integer, enter again:");
            }
            scanner.nextLine();
        }
    }

}

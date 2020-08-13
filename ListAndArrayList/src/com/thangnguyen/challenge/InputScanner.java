package com.thangnguyen.challenge;

import java.util.Scanner;

public class InputScanner {

    public static int getIntInput(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Enter an valid integer.");
            }
//            scanner.close();
        }
    }

    public static String getInputString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
//        scanner.close();
        return input;
    }

}

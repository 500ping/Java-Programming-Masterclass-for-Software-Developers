package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            System.out.println("Hello " + name + ", you are " + (2020 - yearOfBirth) + " years old.");
        } else {
            System.out.println("Invalid year of birth!");
        }

        scanner.close();
    }

}

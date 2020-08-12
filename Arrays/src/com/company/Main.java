package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int myVariable[] = new int[50];
//        int myVariable[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i = 0; i < myVariable.length; i++) {
//            System.out.println(myVariable[i]);
//        }

        int limit = getInputInteger("Enter number of the elements:");
        int inputArray[] = getIntArray(limit);
        int sortedArray[] = sortIntegers(inputArray);

        System.out.println("Sorted array = " + Arrays.toString(sortedArray));

        scanner.close();
    }

    public static int getInputInteger(String message) {
        while (true) {
            System.out.println(message);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                return input;
            } else {
                System.out.println("Not an integer!");
            }
            scanner.nextLine();
        }
    }

    public static int[] getIntArray(int limit) {
        int returnArray[] = new int [limit];

        int counter = 0;
        while (counter < limit) {
            System.out.println("Enter element " + (counter + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                returnArray[counter] = input;
                counter++;
            } else {
                System.out.println("Not an integer!");
            }
            scanner.nextLine();
        }

        return returnArray;
    }

    public static int[] sortIntegers(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntArray[] = {1, 2, 3, 4, 5};
        int myNewArray[] = myIntArray;
        myNewArray[0] = 10;

        // Just like python
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myNewArray));

        myNewArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myNewArray));
    }

    private static void modifyArray(int array[]) {
        array[0] = 2;
        //method can't ...
        array = new int[] {1, 2, 3, 4, 5};
    }
}

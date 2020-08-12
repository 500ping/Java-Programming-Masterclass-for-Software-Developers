package com.company;

import java.util.Arrays;

public class Challenge {

    public static void main(String[] args) {
        int testArray[] = {2, 1, 3, 4, 5, 0, 7};
        System.out.println(findMin(testArray));

        System.out.println(Arrays.toString(reverse(testArray)));
//        System.out.println(Arrays.toString(reverse2(testArray)));

        //array will be change if use reverse2()
        System.out.println(Arrays.toString(testArray));
    }

    public static int findMin(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Reverse without modify old array
    public static int[] reverse(int array[]) {
        int reversedArray[] = new int [array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index] = array[i];
            index++;
        }
        return reversedArray;
    }

    //Performance way
    public static int[] reverse2(int array[]) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i ++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }
}

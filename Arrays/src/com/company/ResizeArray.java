package com.company;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0 ; i < 10; i++) {
            array[i] = i;
        }

        int temp[] = array;
        array = new int[12];

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }

        array[temp.length] = 99;
        array[temp.length + 1] = 100;

        System.out.println(Arrays.toString(array));
    }

}

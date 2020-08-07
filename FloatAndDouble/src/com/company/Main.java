package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("(float) min: " + myMinFloatValue + ", max: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("(double) min: " + myMinDoubleValue + ", max: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; //should use double
        System.out.println("int: " + myIntValue + ", float: " + myFloatValue + ", double: " + myDoubleValue);

        double numberOfPounds = 200;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println(numberOfPounds + " pounds = " + convertedKilograms + " kg");

        System.out.println(Math.PI);
    }

}

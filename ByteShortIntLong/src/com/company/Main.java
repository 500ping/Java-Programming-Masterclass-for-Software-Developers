package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("(int )Min: " + myMinIntValue + ", max: " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); //Overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //Underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("(byte) Min: " + myMinByteValue + ", max: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("(short) Min: " + myMinShortValue + ", max: " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("(long) Min: " + myMinLongValue + ", max: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinByteValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte value1 = 5;
        short value2 = 12;
        int value3 = 1998;
        long result = 50000 + 10 * (value1 + value2 + value3); //no need to cast because long is comfortable with int value
        System.out.println(result);

        short shortTotal = (short) (1000 + 10 * (value1 + value2 + value3)); //need to cast because short is not comfortable with int value
    }

}

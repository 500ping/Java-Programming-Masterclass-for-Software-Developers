package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result -= 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result *= 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result %= 3; //4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        result++; // result = result + 1 (1 + 1 = 2)
        System.out.println("1 + 1 = " + result);

        result--; // result = result - 1 (2 - 1 = 1)
        System.out.println("2 - 1 = " + result);

        boolean isAlien = false;
        // if aline == false
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        // ==, !=, >=, <=
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore < 90) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false; // if isCar = true => wasCar = true, else wasCar = false
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        System.out.println("-----------------------------------------------------------");

        //Challenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotla = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = myValueTotla % 40.00d;
        boolean isNoRemainder = theRemainder == 0 ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculate("Thang", 500);
        System.out.println("New score is: " + newScore);

        calculate(75);

        calculate();

        //challenge
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double convertedToCentimets = feet * 12 * 2.54 + inches * 2.54;
        return convertedToCentimets;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static int calculate(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculate(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculate() {
        System.out.println("No player name, no player score.");
        return 0;
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your highscore was: " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your highscore was: " + highScore);

        //challenge
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player 4", playerPosition);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " - position: " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

}

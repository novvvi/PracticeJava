package com.udemy;

public class Main {


    public static void main(String[] args) {
        String playerName = "Novi";
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, highScorePosition);
        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition(playerName, highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(playerName, highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition(playerName, highScorePosition);
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition( int score) {
        if (score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if( score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
        attempts = GuessNumber.MAX_ATTEMPTS;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempt(int attempts) {
        this.attempts = attempts;
    }

    public int getLastNumber() {
        return enteredNumbers[GuessNumber.MAX_ATTEMPTS - (getAttempts() + 1)];
    }

    public void setEnteredNumber(int attempts, int number) {
        enteredNumbers[attempts] = number;
        this.attempts--;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

}

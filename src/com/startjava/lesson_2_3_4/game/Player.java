package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
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

    public void setAttempt() {
        attempts--;
    }

    public int[] getEnteredNumbers(int attempts) {
        return Arrays.copyOf(enteredNumbers, attempts);
    }

    public int getOnlyOneNumber(int attempt) {
        return enteredNumbers[GuessNumber.maxAttempts - attempt];
    }

    public void setEnteredNumbers(int index, int number) {
        enteredNumbers[index] = number;
    }
}

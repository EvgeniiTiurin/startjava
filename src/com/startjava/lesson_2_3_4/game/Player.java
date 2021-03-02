package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[GuessNumber.MAX_ATTEMPTS];

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

    public void setAttempt(int attempt) {
        this.attempts = attempt;
    }

    public int getLastNumber() {
        return enteredNumbers[GuessNumber.MAX_ATTEMPTS - (attempts + 1)];
    }

    public void setEnteredNumber(int attempt, int number) {
        enteredNumbers[attempt] = number;
        attempts--;
    }

    public int[] getEnteredNumbers() {
        int[] numbers = Arrays.copyOf(enteredNumbers, GuessNumber.MAX_ATTEMPTS - getAttempts());
        return numbers;
    }
}

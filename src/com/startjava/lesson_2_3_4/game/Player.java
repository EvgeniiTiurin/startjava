package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts = 10;
    private int number;
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

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setAttempts() {
        this.attempts--;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getArray(int attempts) {
        return Arrays.copyOf(enteredNumbers, attempts);
    }

    public void setArray(int number, int index) {
        enteredNumbers[index - 1] = number;
    }
}

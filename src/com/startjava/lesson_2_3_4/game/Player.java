package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class Player {
    private String name;
    static Scanner scan = new Scanner(System.in);
    static private int numberOfPlayer = 1;
    private int attempts;
    private int[] enteredNumbers = new int[10];

    public Player() {
        System.out.print("\nВведите имя игрока " + numberOfPlayer + " : ");
        name = scan.next();
        numberOfPlayer++;
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

    public void setAttempt() {
        attempts--;
    }

    public void getEnteredNumbers(int attempts) {
        System.out.print("\nЧисла игрока " + getName() + " : ");
        for (int i = 0; i < GuessNumber.MAX_ATTEMPTS - attempts; i++) {
            System.out.print(getLastNumber(GuessNumber.MAX_ATTEMPTS - i) + " ");
        }
    }

    public int getLastNumber(int attempt) {
        return enteredNumbers[GuessNumber.MAX_ATTEMPTS - attempt];
    }

    public void setEnteredNumber(int attempts, int number) {
        enteredNumbers[attempts] = number;
    }
}

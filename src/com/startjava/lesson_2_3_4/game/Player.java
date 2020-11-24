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

    public void setAttempt() {
        attempts--;
    }

    public void getEnteredNumbers(int attempts) {
        //        return Arrays.copyOf(enteredNumbers[], GuessNumber.MAX_ATTEMPTS - attempts);
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

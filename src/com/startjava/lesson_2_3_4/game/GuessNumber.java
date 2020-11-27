package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    public static final int MAX_ATTEMPTS = 10;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        System.out.println("\nУ Вас по " + GuessNumber.MAX_ATTEMPTS + " попыток");
        setGoal();
        firstPlayer.setAttempt(MAX_ATTEMPTS);
        secondPlayer.setAttempt(MAX_ATTEMPTS);

        while (!makeMove(firstPlayer) && !makeMove(secondPlayer)) {
            if (secondPlayer.getAttempts() == 0) {
                System.out.println("\nУ " + firstPlayer.getName() + " закончились попытки");
                System.out.println("\nУ " + secondPlayer.getName() + " закончились попытки");
                showPlayerNumbers(firstPlayer);
                showPlayerNumbers(secondPlayer);
                return;
            }
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private boolean makeMove(Player player) {
        if (player.getAttempts() > 0) {
            inputNumber(player);
            return checkNumber(player);
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.print("\nИгрок " + player.getName() + ", вводит число : ");
        player.setEnteredNumber(MAX_ATTEMPTS - player.getAttempts(), scan.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getLastNumber(player.getAttempts() + 1) == secretNumber) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + secretNumber + " с " + (MAX_ATTEMPTS - player.getAttempts()) + " попытки");
            showPlayerNumbers(firstPlayer);
            showPlayerNumbers(secondPlayer);
            return true;
        }
        String checkAnswer = (player.getLastNumber(player.getAttempts() + 1) > secretNumber) ? "больше" : "меньше";
        System.out.println("\nЧисло игрока " + player.getName() + " " + checkAnswer + " загаданного");
        System.out.println("\nУ игрока " + player.getName() + " осталось " + player.getAttempts() + " попыт(ок/ки)");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.print("\nЧисла игрока " + player.getName() + " : ");
        for (int i = 0; i < GuessNumber.MAX_ATTEMPTS - player.getAttempts(); i++) {
            System.out.print(player.getLastNumber(GuessNumber.MAX_ATTEMPTS - i) + " ");
        }
    }
}
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

        do {
            inputNumber(firstPlayer);
            if (!checkNumber(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
        } while (checkNumber(secondPlayer) && !(secondPlayer.getAttempts() == 0));
        if (secondPlayer.getAttempts() == 0) {
            System.out.println("\nУ " + firstPlayer.getName() + " закончились попытки");
            System.out.println("У " + secondPlayer.getName() + " закончились попытки");
            System.out.print("\nЧисла игрока " + firstPlayer.getName() + " : ");
            for (int i = 0; i < MAX_ATTEMPTS; i++) {
                System.out.print(firstPlayer.getLastNumber(MAX_ATTEMPTS - i) + " ");
            }
            System.out.print("\nЧисла игрока " + secondPlayer.getName() + " : ");
            for (int i = 0; i < MAX_ATTEMPTS; i++) {
                System.out.print(secondPlayer.getLastNumber(MAX_ATTEMPTS - i) + " ");
            }
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private void inputNumber(Player player) {
        System.out.print("\nИгрок " + player.getName() + ", вводит число : ");
        player.setEnteredNumber(MAX_ATTEMPTS - player.getAttempts(), scan.nextInt());
        player.setAttempt();
    }

    private boolean checkNumber(Player player) {
        if (player.getLastNumber(player.getAttempts() + 1) == secretNumber) {
            System.out.println("\n\nИгрок " + player.getName() + " угадал число " + secretNumber + " с " + (MAX_ATTEMPTS - player.getAttempts()) + " попытки");
            playerArray(player);
            return false;
        }
        String checkAnswer = (player.getLastNumber(player.getAttempts() + 1) > secretNumber) ? "больше" : "меньше";
        System.out.println("\nЧисло игрока " + player.getName() + " " + checkAnswer + " загаданного");
        System.out.println("\nУ игрока " + player.getName() + " осталось " + player.getAttempts() + " попыт(ок/ки)");
        return true;
    }

    private void playerArray(Player player) {
        System.out.print("\nЧисла игрока " + firstPlayer.getName() + " : ");
        for (int i = 0; i < (MAX_ATTEMPTS - firstPlayer.getAttempts()); i++) {
            System.out.print(firstPlayer.getLastNumber(MAX_ATTEMPTS - i) + " ");
        }
        System.out.print("\nЧисла игрока " + secondPlayer.getName() + " : ");
        for (int i = 0; i < (MAX_ATTEMPTS - secondPlayer.getAttempts()); i++) {
            System.out.print(secondPlayer.getLastNumber(MAX_ATTEMPTS - i) + " ");
        }
        firstPlayer.setAttempt(MAX_ATTEMPTS);
        secondPlayer.setAttempt(MAX_ATTEMPTS);
    }
}
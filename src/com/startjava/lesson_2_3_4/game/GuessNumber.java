package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        setGoal();
        firstPlayer.setAttempts(10);
        secondPlayer.setAttempts(10);

        do {
            inputNumber(firstPlayer);
            if (!checkNumber(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
        } while (checkNumber(secondPlayer) && !(secondPlayer.getAttempts() == 0));
        if (secondPlayer.getAttempts() == 0) {
            System.out.println("\nУ " + firstPlayer.getName() + " закончились попытки");
            System.out.println("У " + secondPlayer.getName() + " закончились попытки\n");
            System.out.println(Arrays.toString(firstPlayer.getArray(10)));
            System.out.println(Arrays.toString(secondPlayer.getArray(10)));
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private void inputNumber(Player player) {
        System.out.print("\nИгрок " + player.getName() + ", вводит число : ");
        player.setNumber(scan.nextInt());
        player.setArray(player.getNumber(), 11-player.getAttempts());
    }

    private boolean checkNumber(Player player) {
        player.setAttempts();
        if (player.getNumber() == secretNumber) {
            System.out.println("\nЧисла игрока " + firstPlayer.getName() + " : " + Arrays.toString(Arrays.copyOf(firstPlayer.getArray(10 - firstPlayer.getAttempts()), 10 - firstPlayer.getAttempts())));
            System.out.println("Числа игрока " + secondPlayer.getName() + " : " + Arrays.toString(Arrays.copyOf(secondPlayer.getArray(10 - secondPlayer.getAttempts()), 10 - secondPlayer.getAttempts())));
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " + (10 - player.getAttempts()) + " попытки");
            return false;
        }
        String checkAnswer = (player.getNumber() > secretNumber) ? "больше" : "меньше";
        System.out.println("\nЧисло игрока " + player.getName() + " " + checkAnswer + " загаданного");
        System.out.println("\nУ игрока " + player.getName() + " осталось " + player.getAttempts() + " попыт(ок/ки)");
        return true;
    }
}
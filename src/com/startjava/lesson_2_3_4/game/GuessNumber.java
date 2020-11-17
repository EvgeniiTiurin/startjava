package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    public static final int maxAttempts = 10;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        setGoal();
        firstPlayer.setAttempt(maxAttempts);
        secondPlayer.setAttempt(maxAttempts);

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
            System.out.println(Arrays.toString(firstPlayer.getEnteredNumbers(maxAttempts)));
            System.out.println(Arrays.toString(secondPlayer.getEnteredNumbers(maxAttempts)));
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private void inputNumber(Player player) {
        System.out.print("\nИгрок " + player.getName() + ", вводит число : ");
        player.setEnteredNumbers(maxAttempts - player.getAttempts(), scan.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getOnlyOneNumber(player.getAttempts()) == secretNumber) {
            player.setAttempt();
            System.out.print("\nЧисла игрока " + firstPlayer.getName() + " : ");
            for (int i = 0; i <= (firstPlayer.getEnteredNumbers(maxAttempts - firstPlayer.getAttempts())).length-1; i++) {
                System.out.print(firstPlayer.getOnlyOneNumber(maxAttempts - i) + " ");
            }
            System.out.print("\nЧисла игрока " + secondPlayer.getName() + " : ");
            for (int i = 0; i <= (secondPlayer.getEnteredNumbers(maxAttempts - secondPlayer.getAttempts())).length-1; i++) {
                System.out.print(secondPlayer.getOnlyOneNumber(maxAttempts - i) + " ");
            }
            System.out.println("\n\nИгрок " + player.getName() + " угадал число " + secretNumber + " с " + (maxAttempts - player.getAttempts()) + " попытки");
            return false;
        }
        String checkAnswer = (player.getOnlyOneNumber(player.getAttempts()) > secretNumber) ? "больше" : "меньше";
        System.out.println("\nЧисло игрока " + player.getName() + " " + checkAnswer + " загаданного");
        player.setAttempt();
        System.out.println("\nУ игрока " + player.getName() + " осталось " + player.getAttempts() + " попыт(ок/ки)");
        return true;
    }
}
package com.startjava.Lesson_1.game;

public class FirstGame {
    public static void main(String[] args) {
        int goal = 40;
        int playerNumber = 46;

        while (goal != playerNumber) {
            if (goal > playerNumber) {
                System.out.println ("Введенное вами число меньше того, что загадал компьютер");
                playerNumber ++;
            } else if (goal < playerNumber) {
                System.out.println ("Введенное вами число больше того, что загадал компьютер");
                playerNumber --;
            }
        }
        System.out.println ("Вы угадали!");
    }
}

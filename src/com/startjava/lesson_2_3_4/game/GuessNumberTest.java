package com.startjava.lesson_2_3_4.game;
import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in,"Cp866");

    public static void main(String[] args) {
        System.out.print("\nВведите имя первого игрока : ");
        Player firstPlayer = new Player(scan.next());

        System.out.print("\nВведите имя второго игрока : ");
        Player secondPlayer = new Player(scan.next());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        do {
            game.start();
        } while (isNext());
    }

    private static boolean isNext() {
        String answer;
        do {
            System.out.print("\nХотите продолжить? [да/нет]: ");
            answer = scan.next();
            if (answer.equals("нет")) {
                return false;
            }
        } while (!answer.equals("да"));
        return  true;
    }
}

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in, "Cp866");

    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer ) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        setGoal();

        while (true) {
            insertNumber(firstPlayer);
            if (!checkNumber(firstPlayer)) {
                break;
            } else {
                insertNumber(secondPlayer);
                if (!checkNumber(secondPlayer)) {
                    break;
                } else {
                    compareNumbers();
                }
            }
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private void insertNumber(Player player) {
        System.out.print("\nИгрок " + player.getName() + ", вводит число : ");
        player.setNumber(scan.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            victory(player);
            return false;
        } else {
            return true;
        }
    }

    private void compareNumbers() {
        if (firstPlayer.getNumber() > secretNumber) {
            System.out.println ("\nЧисло игрока " + firstPlayer.getName() + " больше загаданного");
        } else {
            System.out.println ("\nЧисло игрока " + firstPlayer.getName() + " меньше загаданного");
        }

        if (secondPlayer.getNumber() > secretNumber) {
            System.out.println ("\nЧисло игрока " + secondPlayer.getName() + " больше загаданного");
        } else {
            System.out.println ("\nЧисло игрока " + secondPlayer.getName() + " меньше загаданного");
        }
    }

    private void victory(Player player) {
        System.out.println("\nИгрок " + player.getName() + " угадал!!! Это победа!!!");
        System.out.println("\nЗагаданное число : " + player.getNumber());
    }
}

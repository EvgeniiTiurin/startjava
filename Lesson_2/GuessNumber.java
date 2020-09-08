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

        while (insert()) {
            compare();
        }
    }

    private void setGoal() {
        secretNumber = (int) Math.floor(Math.random() * 101);
    }

    private boolean insert() {
        System.out.print("\nИгрок номер один, вводит число : ");
        firstPlayer.setNumber(scan.nextInt());

        if (firstPlayer.getNumber() == secretNumber) {
            victory(firstPlayer);
            return false;
        }

        System.out.print("\nИгрок номер два, вводит число : ");
        secondPlayer.setNumber(scan.nextInt());

        if (secondPlayer.getNumber() == secretNumber) {
            victory(secondPlayer);
            return false;
        } else {
            return true;
        }
    }

    private void compare() {
        if (firstPlayer.getNumber() > secretNumber) {
            System.out.println ("\nЧисло первого игрока больше загаданного");
        } else {
            System.out.println ("\nЧисло первого игрока меньше загаданного");
        }

        if (secondPlayer.getNumber() > secretNumber) {
            System.out.println ("\nЧисло второго игрока больше загаданного");
        } else {
            System.out.println ("\nЧисло второго игрока меньше загаданного");
        }
    }

    private void victory(Player player) {
        System.out.println("\nИгрок " + player.getName() + " угадал!!! Это победа!!!");
        System.out.println("\nЗагаданное число : " + player.getNumber());
    }
}

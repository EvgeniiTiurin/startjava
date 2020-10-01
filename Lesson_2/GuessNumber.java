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
            }
            insertNumber(secondPlayer);
            if (!checkNumber(secondPlayer)) {
                break;
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
            toWin(player);
            return false;
        } else {
            if (player.getNumber() > secretNumber) {
                System.out.println ("\nЧисло игрока " + player.getName() + " больше загаданного");
            } else {
                System.out.println ("\nЧисло игрока " + player.getName() + " меньше загаданного");
            }
            return true;
        }
    }

    private void toWin(Player player) {
        System.out.println("\nИгрок " + player.getName() + " угадал!!! Это победа!!!");
        System.out.println("\nЗагаданное число : " + player.getNumber());
    }
}

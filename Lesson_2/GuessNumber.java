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

    private void setGoal() {
        this.secretNumber = (int) Math.floor(Math.random() * 101);
    }

    public void start() {
        setGoal();

        while (true) {
            System.out.print("\nИгрок номер один, вводит число : ");
            firstPlayer.setNumber(scan.nextInt());

            if (firstPlayer.getNumber() == secretNumber) {
                victory(firstPlayer);
                break;
            }

            System.out.print("\nИгрок номер два, вводит число : ");
            secondPlayer.setNumber(scan.nextInt());

            if (secondPlayer.getNumber() == secretNumber) {
                victory(secondPlayer);
                break;
            } else {
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
        }
    }

    private void victory(Player player) {
        System.out.println("\nИгрок " + player.getName() + " угадал!!! Это победа!!!");
        System.out.println("\nЗагаданное число : " + player.getNumber());
    }
}

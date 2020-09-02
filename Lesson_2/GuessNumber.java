import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in, "Cp866");

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer ) {
    this.firstPlayer = firstPlayer;
    this.secondPlayer = secondPlayer;
    }

    private int goal;

    public int getGoal() {
        return goal;
    }

    public void setGoal() {
        this.goal = (int) (Math.random() * 100);
    }

    public void start() {
        setGoal();

        while (true) {
            System.out.print("\nИгрок номер один, вводит число : ");
            firstPlayer.setNumber(scan.nextInt());

            System.out.print("\nИгрок номер два, вводит число : ");
            secondPlayer.setNumber(scan.nextInt());

            if (firstPlayer.getNumber() == goal) {
                victory(firstPlayer);
                break;
            } else if (secondPlayer.getNumber() == goal) {
                victory(secondPlayer);
                break;
            } else {
                if (firstPlayer.getNumber() > goal) {
                    System.out.println ("\nЧисло первого игрока больше загаданного");
                } else {
                    System.out.println ("\nЧисло первого игрока меньше загаданного");
                }

                if (secondPlayer.getNumber() > goal) {
                    System.out.println ("\nЧисло второго игрока больше загаданного");
                } else {
                    System.out.println ("\nЧисло второго игрока меньше загаданного");
                }
            }
        }
    continueGame();
    }

    public void continueGame() {
        System.out.print("\nХотите продолжить? [да/нет]: ");

        switch(scan.next()) {
            case "да":
                start();
                break;
            case "нет":
                endGame();
                break;
            default:
                continueGame();
                break;
        }
    }

    public void victory(Player player) {
        System.out.println("\nИгрок " + player.getName() + " угадал!!! Это победа!!!");
        System.out.println("\nЗагаданное число : " + getGoal());
    }

    public void endGame() {
        System.out.println("\nИгра завершилась!");
        return;
    }
}

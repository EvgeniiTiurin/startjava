import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in, "Cp866");
    private int goal;

    public int getGoal() {
        return goal;
    }

    public void setGoal() {
        this.goal = (int) (Math.random() * 100);
    }

    public void start(Player firstPlayer, Player secondPlayer) {
        setGoal();

        while (true) {
            System.out.print("\nИгрок номер один, вводит число : ");
            firstPlayer.setNumber(scan.nextInt());

            System.out.print("\nИгрок номер два, вводит число : ");
            secondPlayer.setNumber(scan.nextInt());

            if (firstPlayer.getNumber() == goal) {
                victory(firstPlayer);
                break;
            }

            else if (secondPlayer.getNumber() == goal) {
                victory(secondPlayer);
                break;
            }

            else {
                if (firstPlayer.getNumber() > goal) {
                    System.out.println ("\nЧисло первого игрока больше загаданного");
                } else {
                    System.out.println ("\nЧисло первого игрока меньше загаданного");
                }

                if (secondPlayer.getNumber() > goal) {
                    System.out.println ("\nЧисло второго игрока > загаданного");
                } else {
                    System.out.println ("\nЧисло второго игрока < загаданного");
                }
            }
        }
    continueGame(firstPlayer, secondPlayer);
    }

    public void continueGame(Player firstPlayer, Player secondPlayer) {
        System.out.print("\nХотите продолжить? [да/нет]: ");

        switch(scan.next()) {
            case "да":
                start(firstPlayer, secondPlayer);
                break;
            case "нет":
                endGame();
                break;
            default:
                continueGame(firstPlayer, secondPlayer);
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

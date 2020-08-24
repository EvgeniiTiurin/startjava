import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in, "Cp866");
    private int goal;

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void generateNumber() {
        System.out.print("\nВведите искомое число: ");
        setGoal(scan.nextInt());
    }

    public void startGame(Player firstPlayer, Player secondPlayer) {
        int first, second;

        while (true) {
            System.out.print("\nИгрок номер один, вводит число : ");
            first = scan.nextInt();

            System.out.print("\nИгрок номер два, вводит число : ");
            second = scan.nextInt();

            if (first == goal) {
                victory(firstPlayer);
                break;
            }

            else if (second == goal) {
                victory(secondPlayer);
                break;
            }

            else {
                if (first > goal) {
                    System.out.println ("\nЧисло первого игрока > загаданного");
                } else {
                    System.out.println ("\nЧисло первого игрока < загаданного");
                }

                if (second > goal) {
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
                generateNumber();
                startGame(firstPlayer, secondPlayer);
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

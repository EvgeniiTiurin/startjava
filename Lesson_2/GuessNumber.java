import java.util.Scanner;

public class GuessNumber {

    private int first;
    private int second;
    private int number;
    Scanner scan = new Scanner(System.in);

    public void inGame(String name , int number) {
        String tempName = name;
        int playerNumber = number;
        while (goal != playerNumber) {
            if (goal > playerNumber) {
                System.out.println("\nВведенное вами число меньше того, что загадал компьютер");
                playerNumber ++;
            } else if (goal < playerNumber) {
                System.out.println("\nВведенное вами число больше того, что загадал компьютер");
                playerNumber --;
            }
        }
        System.out.println("\nВы угадали!");
        //victory(tempName);
    }

    public void startGame() {
        System.out.println("\nИгра запустилась!");
    }

    public void endGame() {
        System.out.println("\nИгра завершилась!");
        return;
    }

    public boolean continueGame() {
        String yes = "да";
        String no = "нет";

        System.out.print("\nХотите продолжить? [да/нет]: ");
        String answer = scan.next();

        switch(answer) {
            case "да":
                System.out.print("\nВведите имя первого игрока : ");
                String name = scan.nextLine();
                firstPlayer.setName(name);
                System.out.print("\nВведите имя второго игрока : ");
                name = scan.nextLine();
                secondPlayer.setName(name);
                inGame();
            case "нет":
                break;
            default:
                continueGame();
        }
    }

    public void changePlayer() {
        if wrong answer{
            System.out.println("\nТеперь ответ второго игрока");
        } else {

        }
    }

    public void victory(String player) {
        System.out.println("\nИгрок" + player + " угадал!!! Это победа!!!");
    }


}

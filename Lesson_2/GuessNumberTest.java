import java.util.Scanner;

public class GuessNumberTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"Cp866");

        System.out.print("\nВведите имя первого игрока : ");
        Player firstPlayer = new Player();
        firstPlayer.setName(scan.next());

        System.out.print("\nВведите имя первого игрока : ");
        Player secondPlayer = new Player();
        secondPlayer.setName(scan.next());

        GuessNumber game = new GuessNumber();
        game.setGoal();
        game.startGame(firstPlayer, secondPlayer);
    }
}

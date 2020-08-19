import java.util.Scanner;

public class GuessNumberTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"Cp866");
        Player firstPlayer = new Player();
        System.out.print("\nВведите имя первого игрока : ");
        String name = scan.nextLine();
        firstPlayer.setName(name);
        System.out.println("\nИмя первого игрока : " + firstPlayer.getName());
        Player secondPlayer = new Player();
        System.out.print("\nВведите имя второго игрока : ");
        name = scan.nextLine();
        secondPlayer.setName(name);
        System.out.println("\nИмя второго игрока : " + secondPlayer.getName());

        GuessNumber game = new GuessNumber();
        game.startGame();

        game.endGame();
    }
}

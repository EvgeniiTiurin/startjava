import java.util.Scanner;

public class GuessNumberTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"Cp866");

        System.out.print("\nВведите имя первого игрока : ");
        Player firstPlayer = new Player(scan.next());


        System.out.print("\nВведите имя второго игрока : ");
        Player secondPlayer = new Player(scan.next());

        GuessNumber game = new GuessNumber();
        game.start(firstPlayer, secondPlayer);
    }
}

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.isMale = true;
        firstWolf.name = "Дымок";
        firstWolf.weight = 45.65f;
        firstWolf.age = 7;
        firstWolf.color = "Grey";

        System.out.println(firstWolf.isMale);
        System.out.println(firstWolf.name);
        System.out.println(firstWolf.weight);
        System.out.println(firstWolf.age);
        System.out.println(firstWolf.color);

        firstWolf.sit();
        firstWolf.move();
        firstWolf.hunt();
        firstWolf.howl();
        System.out.println(firstWolf.hunt());
    }
}

public class Wolf {
    boolean isMale;
    String name;
    float weight;
    int age;
    String color;

    void move() {
        System.out.println("Волк переместился");
    }

    void sit() {
        System.out.println("Сел");
    }

    void howl() {
        System.out.println("Ууууууууууууууууууууууууууу");
    }

    boolean hunt() {
        System.out.println ("Волк идёт на охоту");
        return true;
    }
}

public class Person {
    boolean isMale = true;
    String name = "Филипп";
    float height = 1.78f;
    double weight = 75.4;
    int age = 27;

    void move() {
        System.out.println("Движение вперёд");
    }

    void sit() {
        System.out.println("Если можно сидеть - не трать энергию и сядь");
    }

    void run() {
        System.out.println("Побежали!");
    }

    String saySomething() {
        System.out.println("Привет!");
        return "nothing";
    }

    boolean learnJava() {
        System.out.println("Изучаем Java с удовольствием");
        return true;
    }
}

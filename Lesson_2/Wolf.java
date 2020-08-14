public class Wolf {
    private boolean isMale;
    private String name;
    private float weight;
    private int age;
    private String color;

    public boolean getIsMale() {
        return isMale;
    }
    void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }
    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    void setAge(int age) {
        if (age > 8 ) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Волк переместился");
    }

    public void sit() {
        System.out.println("Сел");
    }

    public void howl() {
        System.out.println("Ууууууууууууууууууууууууууу");
    }

    public boolean hunt() {
        System.out.println ("Волк идёт на охоту");
        return true;
    }
}

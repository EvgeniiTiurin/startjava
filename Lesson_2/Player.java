public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == "") {
            System.out.println("Вы ввели пустую строку");
        } else {
            this.name = name;
        }
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Player() {
    }
}

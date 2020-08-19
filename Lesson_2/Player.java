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

    //public Player(String name) {
    //    this.name = name;
    //}

    private int number = 1;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        if(number== 0) {
            System.out.println("Вы ввели 0, введите другое число");
        } else {
            this.number = number;
        }
    }
}

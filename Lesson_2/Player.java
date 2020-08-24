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
}

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        double height = 2.3;
        boolean isMale = true;
        String name = "Maksim";
        System.out.println();
        System.out.println("Возраст : " + age);
        System.out.println("Пол мужской? (введите true or false) : " + isMale);
        System.out.println("Рост : " + height);
        System.out.println("Имя : " + name);
        char n = name.charAt(0);
        if (age > 20) {
            System.out.println("Уже не юнец");
        };
        if (isMale == true) {
            System.out.println("Это парень");
        }
        if (isMale != true)
            System.out.println("Это девушка");
        if (height < 1.80){
            System.out.println("Мал да удал");
        } else {
            System.out.println("За ветки не цепляешься?");
        }
        if (n == 'M') {
            System.out.println("Ооо, да у тебя имя начинается с той же буквы, что и у моего преподавателя!");
        } else if (n == 'I') {
            System.out.println("Начинается на I");
        } else {
            System.out.println("Имя с необычной для этого занятия буквы");
        }
    }
}

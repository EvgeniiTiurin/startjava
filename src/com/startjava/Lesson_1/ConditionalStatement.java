package com.startjava.Lesson_1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        if (age > 20) {
            System.out.println("Уже не юнец");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Это парень");
        }
        if (!isMale) {
            System.out.println("Это девушка");
        }

        double height = 2.3;
        if (height < 1.80) {
            System.out.println("Мал да удал");
        } else {
            System.out.println("За ветки не цепляешься?");
        }

        String name = "Maksim";
        char firstSymbol = name.charAt(0);
        if (firstSymbol == 'M') {
            System.out.println("Ооо, да у тебя имя начинается с той же буквы, что и у моего преподавателя!");
        } else if (firstSymbol == 'I') {
            System.out.println("Начинается на I");
        } else {
            System.out.println("Имя с необычной для этого занятия буквы");
        }
    }
}

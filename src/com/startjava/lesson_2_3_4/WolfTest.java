package com.startjava.lesson_2_3_4;

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.setIsMale(true);
        firstWolf.setName("Дымок");
        firstWolf.setWeight(45.55f);
        firstWolf.setAge(6);
        firstWolf.setColor("Dark Grey");

        System.out.println(firstWolf.isMale());
        System.out.println(firstWolf.getName());
        System.out.println(firstWolf.getWeight());
        System.out.println(firstWolf.getAge());
        System.out.println(firstWolf.getColor());

        firstWolf.sit();
        firstWolf.move();
        firstWolf.hunt();
        firstWolf.howl();
        System.out.println(firstWolf.hunt());
    }
}

package com.startjava.lesson_2.robot;


public class JaegerTest {
	public static void main(String[] args){
		Jaeger firstJaeger = new Jaeger();
		System.out.println(firstJaeger.getModelName());
		firstJaeger.setModelName("Имя первого егеря : " + "Cherno-Alpha");
		firstJaeger.setMark("Mark-1");
		firstJaeger.setOrigin("Russia");
		firstJaeger.setArmor(9);
		System.out.println(firstJaeger.getModelName());
		firstJaeger.setModelName("Имя первого егеря : " + "Cherno Alpha");
		System.out.println(firstJaeger.getModelName());
		firstJaeger.setWeight(2.412f);
		firstJaeger.move();
		firstJaeger.scanKaiju();

		Jaeger secondJaeger = new Jaeger();
		secondJaeger.setModelName("Brawler Yukon");
		secondJaeger.setMark("Mark-1");
		secondJaeger.setSpeed(8);
		System.out.println("Поколение второго егеря : " + secondJaeger.getMark());
		secondJaeger.setOrigin("United States of America");
		secondJaeger.setStrenght(5);
		secondJaeger.drift();
		secondJaeger.useVortexCannon();
		System.out.println("Имя второго егеря : " + secondJaeger.getModelName());
	}
}

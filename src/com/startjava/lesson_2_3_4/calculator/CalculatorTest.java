package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
            System.out.println("Результат = " +calc.calculate());
        } while (isNext(calc));
    }

    private static void inputMathExpression(Calculator calc) {
        System.out.print("\nВведите выражение { +, -, *, /, ^, %, M, m }: ");
        String[] values = scan.nextLine().split(" ");
        calc.setNum1(Integer.parseInt(values[0]));
        calc.setMathSign(values[1].charAt(0));
        calc.setNum2(Integer.parseInt(values[2]));
        }

    private static boolean isNext(Calculator calc) {
        String answer;
        do {
            System.out.print("\nХотите продолжить? [да/нет]: ");
            answer = scan.next();
            if (answer.equals("нет")) {
                return false;
            }
        } while (!answer.equals("да"));
        scan.skip("\\R");
        return true;
    }
}

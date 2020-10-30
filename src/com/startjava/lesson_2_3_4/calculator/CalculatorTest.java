package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
            System.out.println("Результат = " + calc.calculate());
        } while (isNext());
    }

    private static void inputMathExpression(Calculator calc) {
        System.out.print("\nВведите выражение { +, -, *, /, ^, %, M, m }: ");
        calc.setValues(scan.nextLine());
        }

    private static boolean isNext() {
        String answer;
        do {
            System.out.print("\nХотите продолжить? [да/нет]: ");
            answer = scan.next();
        } while (!answer.equals("да") && !answer.equals("нет"));
        scan.skip("\\R");
        return answer.equals("да");
    }
}

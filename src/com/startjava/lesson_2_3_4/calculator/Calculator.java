package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char mathSign;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getMathSign() {
        return mathSign;
    }

    public boolean setMathSign(char mathSign) {
        switch(mathSign) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                case '^':
                    this.mathSign = mathSign;
                    return false;
                default:
                    System.out.println("\nНезнакомая операция");
                    return true;
        }
    }

    public void calculate() {
        switch (mathSign) {
            case '+':
                System.out.println("\nРезультат: " + (num1 + num2));
                break;
            case '-':
                System.out.println("\nРезультат: " + (num1 - num2));
                break;
            case '*':
                System.out.println("\nРезультат: " + (num1 * num2));
                break;
            case '/':
                System.out.println("\nРезультат: " + (num1 / num2));
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println("\nРезультат: " + result);
                break;
            case '%':
                System.out.println("\nРезультат: " + (num1 % num2));
                break;
            default:
                break;
        }
    }
}


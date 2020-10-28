package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int num1;
    private int num2;
    private char mathSign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setMathSign(char mathSign) {
        switch(mathSign) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                case '^':
                case 'M':
                case 'm':
                    this.mathSign = mathSign;
                    return false;
                default:
                    System.out.println("\nНезнакомая операция");
                    return true;
        }
    }

    public int calculate() {
       int result = 0;
        switch (mathSign) {
            case '+':
                result = addExact(num1, num2);
                break;
            case '-':
                result = subtractExact(num1, num2);
                break;
            case '*':
                result = multiplyExact(num1, num2);
                break;
            case '/':
                result = floorDiv(num1, num2);
                break;
            case '^':
                result =(int) pow(num1, num2);
                break;
            case '%':
                result = floorMod(num1, num2);
                break;
            case 'M':
                result = max(num1, num2);
                break;
            case 'm':
                result = min(num1, num2);
                break;
            default:
                break;
        }
        return result;
    }
}


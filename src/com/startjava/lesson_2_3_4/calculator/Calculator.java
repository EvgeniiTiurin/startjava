package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int num1;
    private int num2;
    private char mathSign;
    private String[] values;

    public void setValues(String expression) {
        values = expression.split(" ");
        setNum1(Integer.parseInt(values[0]));
        setMathSign(values[1].charAt(0));
        setNum2(Integer.parseInt(values[2]));
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setMathSign(char mathSign) {
        if (mathSign == '+' || mathSign == '-' || mathSign == '*' || mathSign == '/' || mathSign == '^' || mathSign == '%' || mathSign == 'M' || mathSign == 'm') {
            this.mathSign = mathSign;
            return false;
        } else {
            System.out.println("\nНезнакомая операция");
            return true;
        }
    }

    public int calculate() {
        int result = 0;
        switch (mathSign) {
            case '+':
                return addExact(num1, num2);
            case '-':
                return subtractExact(num1, num2);
            case '*':
                return multiplyExact(num1, num2);
            case '/':
                return floorDiv(num1, num2);
            case '^':
                return (int) pow(num1, num2);
            case '%':
                return floorMod(num1, num2);
            case 'M':
                return max(num1, num2);
            case 'm':
                return min(num1, num2);
            default:
                return 0;
        }
    }
}


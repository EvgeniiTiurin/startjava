package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int num1;
    private int num2;
    private char mathSign;

    public int calculate(String expression) {
        splitting(expression.split(" "));
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

    public void splitting(String[] splitExpression) {
        setNum1(Integer.parseInt(splitExpression[0]));
        setMathSign(splitExpression[1].charAt(0));
        setNum2(Integer.parseInt(splitExpression[2]));
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathSign(char mathSign) {
        if (mathSign == '+' || mathSign == '-' || mathSign == '*' || mathSign == '/' || mathSign == '^' || mathSign == '%' || mathSign == 'M' || mathSign == 'm') {
            this.mathSign = mathSign;
        } else {
            System.out.println("\nНезнакомая операция");
        }
    }
}


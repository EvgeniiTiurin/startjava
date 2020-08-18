import java.util.Scanner;

public class Calculator {
    private char mathSign;
    private int num1;
    private int num2;

    public char getMathSign() {
        return mathSign;
    }


    public int getNum1() {
        return num1;
    }


    public int getNum2() {
        return num2;
    }

    void setMathSign(char mathSign) {
        switch(mathSign) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '^':
                this.mathSign = mathSign;
                break;
            default:
                System.out.println("\nНезнакомая операция");
            }
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void calculation() {
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


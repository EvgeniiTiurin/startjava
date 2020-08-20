import java.util.Scanner;

public class Calculator {
    private char mathSign;
    private int num1;
    private int num2;
    Scanner scan = new Scanner(System.in, "Cp866");

    public int getNum1() {
        return num1;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getMathSign() {
    return mathSign;
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
                scanningSign();
            }
    }

    public void scanningSign() {
        System.out.print("\nВведите знак операции: ");
        char mathSign = scan.next().charAt(0);
        setMathSign(mathSign);
    }

    void calculate() {
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
        continueCalc();
    }

    void continueCalc() {
        String yes = "да";
        String no = "нет";
        String answer;

        System.out.print("\nХотите продолжить? [да/нет]: ");
        answer = scan.next();

        switch (answer) {
            case "да":
                System.out.print("\nВведите первое число: ");
                num1 = scan.nextInt();
                setNum1(num1);
                System.out.print("\nВведите второе число: ");
                num2 = scan.nextInt();
                setNum2(num2);
                scanningSign();
                calculate();
            case "нет":
                break;
            default:
                continueCalc();
        }
    }
}


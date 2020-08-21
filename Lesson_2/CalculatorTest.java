import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        startCalculation(calc);
    }

    public static void continueCalc(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        String answer;
        System.out.print("\nХотите продолжить? [да/нет]: ");
        answer = scan.next();
        switch (answer) {
            case "да":
                startCalculation(n);
            case "нет":
                break;
            default:
                continueCalc(n);
        }
    }

    public static void startCalculation(Calculator n) {
        insertData(n);
        scanningSign(n);
        n.calculate();
        continueCalc(n);
    }

    public static void scanningSign(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("\nВведите знак операции: ");
        char mathSign = scan.next().charAt(0);
        switch(mathSign) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '^':
                n.setMathSign(mathSign);
                break;
            default:
                System.out.println("\nНезнакомая операция");
                scanningSign(n);
        }
    }

    public static void insertData(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        n.setNum1(num1);
        System.out.print("\nВведите второе число: ");
        int num2 = scan.nextInt();
        n.setNum2(num2);
    }
}

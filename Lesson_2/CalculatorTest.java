import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        startCalculation(calc);
    }

    private static void startCalculation(Calculator n) {
        inputMathExpression(n);
        n.calculate();
        continueCalc(n);
    }


    private static void inputMathExpression(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("\nВведите первое число: ");
        n.setNum1(scan.nextInt());
        System.out.print("\nВведите второе число: ");
        n.setNum2(scan.nextInt());
        boolean cicle = true;
        do {
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
                    cicle = true;
            }
        } while (cicle == false);
    }

    private static void continueCalc(Calculator n) {
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
}

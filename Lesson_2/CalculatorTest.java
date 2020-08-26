import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
            calc.calculate();
        } while (isNext(calc));
    }

    private static void inputMathExpression(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("\nВведите первое число: ");
        n.setNum1(scan.nextInt());
        System.out.print("\nВведите второе число: ");
        n.setNum2(scan.nextInt());
        do {
            System.out.print("\nВведите знак операции: ");
        } while (n.setMathSign(scan.next().charAt(0)));
    }

    private static boolean isNext(Calculator n) {
        Scanner scan = new Scanner(System.in, "Cp866");
        String answer;
        do {
            System.out.print("\nХотите продолжить? [да/нет]: ");
            answer = scan.next();
            switch (answer) {
                case "да":
                    return true;
                case "нет":
                    return false;
                default:
                    break;
            }
        } while (true);
    }
}

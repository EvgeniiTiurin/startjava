import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in, "Cp866");
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
            calc.calculate();
        } while (isNext(calc));
    }

    private static void inputMathExpression(Calculator calc) {
        System.out.print("\nВведите первое число: ");
        calc.setNum1(scan.nextInt());
        System.out.print("\nВведите второе число: ");
        calc.setNum2(scan.nextInt());
        do {
            System.out.print("\nВведите знак операции: ");
        } while (calc.setMathSign(scan.next().charAt(0)));
    }

    private static boolean isNext(Calculator calc) {
        do {
            System.out.print("\nХотите продолжить? [да/нет]: ");
            switch(scan.next()) {
                case ("да") :
                    return true;
                case ("нет") :
                    return false;
                default :
                    continue;
            }
        } while (true);
    }
}

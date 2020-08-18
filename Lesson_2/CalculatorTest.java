import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        do {
            Calculator calc = new Calculator();

            boolean wrongAnswer = false;
            Scanner scan = new Scanner(System.in, "Cp866");
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            calc.setNum1(num1);
            System.out.print("\nВведите второе число: ");
            int num2 = scan.nextInt();
            calc.setNum2(num2);
            System.out.print("\nВведите знак операции: ");
            char mathSign = scan.next().charAt(0);
            calc.setMathSign(mathSign);
            calc.calculate();

            do {wrongAnswer = true;
                System.out.print("\nХотите продолжить? [да/нет]: ");
                String answer = scan.next();
                switch (answer) {
                    case "да":
                        continue;
                    case "нет":
                        return;
                    default:
                        wrongAnswer = false;
                        break;
                }
            } while (!wrongAnswer);
        } while (true);
    }
}

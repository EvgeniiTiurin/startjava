import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean continueCal = false, wrongAnswer;
        do {
            wrongAnswer = false;
            System.out.print("Введите первое число: ");
            Scanner scan = new Scanner(System.in, "Cp866");
            int num1 = scan.nextInt();
            System.out.print("\nВведите второе число: ");
            int num2 = scan.nextInt();
            System.out.print("\nВведите знак операции: ");
            char mathSign = scan.next().charAt(0);

            Calculator cal = new Calculator();
            cal.setMathSign(mathSign);
            cal.setNum1(num1);
            cal.setNum2(num2);
            cal.calculation();

            outer:
            do {wrongAnswer = true;
                System.out.print("\nХотите продолжить? [да/нет]: ");
                String otvet = scan.next();
                switch (otvet) {
                    case "да":
                        wrongAnswer = false;
                        continueCal = true;
                        break;
                    case "нет":
                        return;
                    default:
                        continue outer;
                }
            } while (!continueCal);
        } while (!wrongAnswer);
    }
}

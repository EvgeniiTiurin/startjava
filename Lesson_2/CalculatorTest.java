import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
            Calculator calc = new Calculator();

            Scanner scan = new Scanner(System.in, "Cp866");
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            calc.setNum1(num1);
            System.out.print("\nВведите второе число: ");
            int num2 = scan.nextInt();
            calc.setNum2(num2);
            calc.scanningSign();
            calc.calculate();
    }
}

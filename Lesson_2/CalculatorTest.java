import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan1.nextInt();
        System.out.println("Введите знак операции: ");
        Scanner scan2 = new Scanner(System.in);
        char mathSign = scan2.next().charAt(0);

        Calculator.setCalculation(mathSign,num1,num2);
    }
}

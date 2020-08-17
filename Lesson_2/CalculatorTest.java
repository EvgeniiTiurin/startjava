import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("");
        System.out.print("Введите второе число: ");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan1.nextInt();
        System.out.println("");
        System.out.print("Введите знак операции: ");
        Scanner scan2 = new Scanner(System.in);
        char mathSign = scan2.next().charAt(0);
        System.out.println("");

        Calculator.setCalculation(mathSign,num1,num2);
    }
}

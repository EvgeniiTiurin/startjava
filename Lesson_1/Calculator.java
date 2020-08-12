public class Calculator {
    public static void main(String[] args) {
        double result;
        int num1 = 9;
        int num2 = 2;
        char mathSign = '%';

        if (mathSign == '+') {
            System.out.println(num1 + num2);
        } else if (mathSign == '-') {
            System.out.println(num1 - num2);
        } else if (mathSign == '*') {
            System.out.println(num1 * num2);
        } else if (mathSign == '/') {
            System.out.println(num1 / num2);
        } else if (mathSign == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        } else if (mathSign == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Незнакомая операция");
        }
    }
}

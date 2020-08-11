public class Calculator {
    public static void main(String[] args) {
        double result;
        int element1 = 9;
        int element2 = 3;
        char operator = '^';

        if (operator == '+') {
            result = element1 + element2;
            System.out.println(result);
        } else if (operator == '-') {
            result = element1 - element2;
            System.out.println(result);
        } else if (operator == '*') {
            result = element1 * element2;
            System.out.println(result);
        } else if (operator == '/') {
            result = element1 / element2;
            System.out.println(result);
        } else if (operator == '^') {
            result = 1;
            for (int i = 1; i <= element2; i++) {
                result = result * element1;
            }
            System.out.println(result);
        } else if (operator == '%') {
            result = element1 % element2;
            System.out.println(result);
        } else {
            System.out.println("Незнакомая операция");
        }

    }
}

public class Calculator {
    private char mathSign;
    private int num1;
    private int num2;

    public void setCalculation (char mathSign,int num1,int num2) {
        this.mathSign = mathSign;
        this.num1 = num1;
        this.num2 = num2;
        switch (mathSign) {
        case '+':
            System.out.println(num1+num2);
            break;
        case '-':
            System.out.println(num1-num2);
            break;
        case '*':
            System.out.println(num1*num2);
            break;
        case '/':
            System.out.println(num1/num2);
            break;
        case '^':
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(result);
            break;
        case '%':
            System.out.println(num1%num2);
            break;
        default:
            System.out.println("Незнакомая операция");
            break;
        }
    }
}


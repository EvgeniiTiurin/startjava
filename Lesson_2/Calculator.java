public class Calculator {
    private char mathSign;
    private int num1;
    private int num2;

    void setCalculation (int num1,int num2,char mathSign) {
        this.mathSign = mathSign;
        this.num1 = num1;
        this.num2 = num2;
        switch (mathSign) {
        case '+':
            System.out.println("Результат: "+(num1+num2));
            break;
        case '-':
            System.out.println("Результат: "+(num1-num2));
            break;
        case '*':
            System.out.println("Результат: "+(num1*num2));
            break;
        case '/':
            System.out.println("Результат: "+(num1/num2));
            break;
        case '^':
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println("Результат: "+result);
            break;
        case '%':
            System.out.println("Результат: "+(num1%num2));
            break;
        default:
            System.out.println("Незнакомая операция");
            break;

            //result = calcul.setCalculation(num1, num2, mathSign);//getOperation());
        }
    }
}


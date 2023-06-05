import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char op;
        int a, b;
        System.out.println("Enter two operands: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter a operation: +,-,*,/,% ");
        op = sc.next().charAt(0);

        switch(op) {

            case '+':
                System.out.println("Addition: "+ (a+b));
                break;

            case '-':
                System.out.println("Subtraction: "+ (a-b));
                break;

                case '*':
                    System.out.println("Multiplication: "+ (a*b));
                break;

            case '/':
                System.out.println("Division: "+ (a/b));
                break;

            case '%':
                System.out.println("Remainder: "+ (a%b));
                    break;

            default:
                System.out.println("Invalid operation.");
        }

    }
}

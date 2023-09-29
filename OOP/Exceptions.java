import java.util.*;

public class Exceptions {

    public static int calculate (int a, int b) throws ArithmeticException {

        int ans = a/b;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nums for dividing: ");
        int a =sc.nextInt();
        int b = sc.nextInt();

        try {
            calculate(a,b);
        } catch(ArithmeticException e) {
            System.out.println("denominator cannot be zero.");
        }
    }
}


import java.util.*;
public class Factorial {

    // functions are stored in the memory in form of stacks
    public static int findFactorial(int n) {

        int fact = 1;

        if(n == 0) {
          return fact;
        }

        else {
            for (int i = n; i >= 1; i--) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial for negative numbers is not possible.");
        }

        else {

            int ans = findFactorial(num);
            System.out.println("Factorial is: " + ans);

        }
    }
}

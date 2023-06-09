import java.util.*;

public class Divisor {

    public static void greatestDivisor(int n1, int n2) {

        int ans = 0;

        // 4 6
        for(int i = 1; i < n1; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                ans = i;
            }
        }

    
        if(ans != 0) {
            System.out.print("Greatest common divisor is: " + ans);
        } else {
            System.out.print("There is no common divisor.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        greatestDivisor(num1, num2);
    }
}
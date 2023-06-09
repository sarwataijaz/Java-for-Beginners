import java.util.*;
public class Prime {

    public static void printPrime(int n) {

            int count = 0;

            if(n == 1) {
                System.out.println("1 is neither prime nor composite.");
                System.exit(0);
            }

            else if(n < 0) {
                System.out.println("Negative numbers cannot be prime.");
                System.exit(0);
            }

            else {
                for (int i = 2; i < n; i++) {
                    if(n % i == 0) {
                        count++;
                    }
                }
            }

            if(count == 0 || count == 2) {
                System.out.println("Its a prime number.");
            }

            else {
                System.out.println("Its not a prime number.");
            }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printPrime(num);
    }
}

import java.util.*;

public class Power {

    public static void printPower(int n, int x) {

        int temp = n;
        for(int i = 1; i < x; i++) {
            n *= temp;
        }

        System.out.print("Ans: " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a power: ");
        int x = sc.nextInt();   
        printPower(n, x);
        sc.close();
    }
}
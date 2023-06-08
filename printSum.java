import java.util.*;
public class printSum {

    public static int printSumm(int n1, int n2) {

        int sum = n1 + n2;

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int sum = printSumm(num1, num2);

        System.out.println("Sum is: " + sum);
    }
}

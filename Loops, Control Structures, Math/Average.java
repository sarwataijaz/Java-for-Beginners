import java.util.*;
public class Average {

    public static void printAverage(int a, int b, int c) {
            float avg = (float) (a+b+c) / 3;
        System.out.print("Average is: " + avg);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        printAverage(n1, n2, n3);
    }
}

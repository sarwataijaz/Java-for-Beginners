import java.util.*;
public class greaterOrlesser {

    public static int getNum(int a, int b) {

        int result = 0;

        if(a == b) {
            System.out.print("Both are equal.");
            System.exit(0);
        } else if(a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = getNum(n1, n2);
        System.out.print("Greater number: " + ans);
    }

}

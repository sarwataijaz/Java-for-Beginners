import java.util.Scanner;

public class CustomExceptions {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second num: ");
        int n2 = sc.nextInt();

        if(n2>n1) {
            throw new MyException("The second number cannot be greater!");
        } else {
            int ans = n1/n2;
            System.out.println(ans);
        }
    }
}

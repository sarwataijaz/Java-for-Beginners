import java.util.*;
public class EvenorOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number: ");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Its an even number.");
        }

        else {
            System.out.println("Its an odd number");
        }
    }
}

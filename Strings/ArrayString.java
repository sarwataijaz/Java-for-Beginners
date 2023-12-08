import java.util.*;
public class ArrayString {

    public static void main(String args[]) {

        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");
        int sum = 0;

        for(int i=0; i<5; i++) {
            arr[i] = sc.next();
            sum += arr[i].length();
        }

        System.out.print("Total length: " + sum);
    }
}

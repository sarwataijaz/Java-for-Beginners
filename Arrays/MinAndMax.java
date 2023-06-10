import java.util.*;

public class MinAndMax {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt(); 
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");

        for(int i = 0; i < size; i++) {
            System.out.print("Arr["+ i +"]:");
            arr[i] = sc.nextInt();
        }

        int min = arr[0]; //Integer.MIN_VALUE; // minimum possible value of int
        int max = arr[0]; //Integer.MAX_VALUE; // maximum possible value of int

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
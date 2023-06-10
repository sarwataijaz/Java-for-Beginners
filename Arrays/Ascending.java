import java.util.*;

public class Ascending {

    public static void main(String[] args) {

        int size = 5;
        int arr[] = new int [size];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // ascending
        // { 1, 2, 4, 7 } is sorted in ascending order.
        // { 7, 4, 2, 1 }
        // {3, 4, 6, 2} is not sorted in ascending order

        boolean isAscending = true;

        for(int i=1; i<size-1; i++) {

            if(arr[i] > arr[i+1]) {
              isAscending  = false;
            }
        }

        if(isAscending) {
            System.out.print("It is in ascending order.");
        }

        else {
            System.out.print("It is not in ascending order.");
        }
    }

}
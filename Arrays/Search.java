import java.util.*;

public class Search {

    public static void main(String[] args) {

        // linear search
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size]; // new is used for allocating some size in the memory
    
        System.out.println("Enter the values: ");

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element you wanna find the index of: ");
        int num = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                System.out.print(num + " is stored in index " + i);
                break;
            }
        }

        sc.close();
        
    }   
}
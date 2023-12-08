import java.util.*;
public class SumOfOddNums {
    public static int calculateSum(int n) {

        int result = 0;
        //TC = O(n)
        for(int i = 1; i <= n*2; i++) {

        if(i % 2 != 0) {
            result += i;
        }
    }


        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       int ans = calculateSum(num);
        System.out.print("Sum of first " + num + " odd numbers is: " + ans);
    }
}

import java.util.*;
public class SumOfNaturalNums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.print("Sum of first " +num+ " natural numbers is: ");

        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}

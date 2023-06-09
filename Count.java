import java.util.*;
public class Count {


    public static void printCount() {

        Scanner sc = new Scanner(System.in);
        int num;
        String input;
        int countZero = 0;
        int countNum = 0;
        int countNegative = 0;


        do {
            System.out.print("Enter a number: ");

            num = sc.nextInt();

            if(num == 0) {
                countZero++;
            } else if(num > 0) {
                countNum++;
            } else {
                countNegative++;
            }

            System.out.print("Do you want to continue? y/n: ");
            input = sc.next();

        } while( !input.equals("n") && !input.equals("N") );

        sc.close();

        System.out.print("Total numbers entered: ZEROS = " + countZero + ", POSITIVE = " + countNum + ", NEGATIVE = " + countNegative);

    }

    public static void main(String[] args) {

        printCount();

    }
}

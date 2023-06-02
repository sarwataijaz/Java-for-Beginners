import java.util.*;
public class switchButtons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter any number: 1,2,3 ");
        num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Assalmualaekum");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}

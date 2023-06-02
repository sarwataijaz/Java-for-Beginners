import java.util.*; //package for using input class "Scanner"
public class Conditions {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in); // sc is an object of Scanner

        System.out.print("Enter yout age: "); // System is a class

        int age = sc.nextInt();

        if(age >= 18) {
            System.out.print("adult");
        }

        else {
            System.out.print("Not an adult");
        }
    }
}

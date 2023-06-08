import java.util.*;
public class functionsIntro {

    public static void printName(String n) {

        System.out.println("Entered name: " + n);

        return;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        printName(name);

    }
}

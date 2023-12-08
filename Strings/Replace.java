import java.util.*;
public class Replace {

    public static void main(String args[]) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        name = sc.next();
        String result = "";

        for(int i = 0; i < name.length(); i++) {

            if(name.charAt(i) == 'e') {
                result += "i";
            } else {
                result += name.charAt(i);
            }
        }

        System.out.println(result);
    }
}

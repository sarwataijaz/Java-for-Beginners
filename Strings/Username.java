import java.util.*;
public class Username {

    public static void main(String[] args) {

        String email;
        String username = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email: ");
        email = sc.next();

        for(int i = 0; i < email.length(); i++) {

            if(email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }

        System.out.print("Your username: \"" + username + "\"");
    }
}

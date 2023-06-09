import java.util.*;
public class Circumference {
    public static final double pi = 3.14;
public static double circum(double r) {

   double result = 2 * pi * r;

    return result;
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of radius: ");
    double radius = sc.nextDouble();

    double ans = circum(radius);

    System.out.print("Circumference: " + ans);

}
}


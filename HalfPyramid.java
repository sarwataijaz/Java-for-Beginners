public class HalfPyramid {
public static void main(String[] args) {
    int n = 5;

    //time complexity : O(n^2) Space complexity: O(1)

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
            }
        System.out.print("\n");
        }

    // with numbers

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
            }
        System.out.print("\n");
        }
    }
}

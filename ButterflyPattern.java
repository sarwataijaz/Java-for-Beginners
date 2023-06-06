public class ButterflyPattern {
    public static void main (String[] args) {

        int n = 4;

        //time complexity : O(n^2) as its always influenced by outer loops
        //space complexity : O(1)
        //first half
        for(int i = 1; i <= n; i++) {
            for(int l = 1; l <= i; l++) {
            // right half
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {

                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                //left half
                System.out.print("*");
            }
            System.out.println();
        }

        // second half

        for(int i = n; i >= 1; i--) {
            for(int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            for(int j = 2*(n-i); j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

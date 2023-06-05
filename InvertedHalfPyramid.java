public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //with numbers

        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // rotated 180 degree

        for (int i = n; i >= 1; i--) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
                for (int k = n; k >= i; k--) {
                    System.out.print("*");
                }
                System.out.print("\n");
        }

    }
}

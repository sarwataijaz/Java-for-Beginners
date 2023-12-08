public class PalindromicPattern {
    public static void main(String[] args) {

        //palindromic: that looks the same even if we write it backwards eg BOB, 121
        int n = 5;


        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //first half numbers
            for(int k = i; k >= 1; k--) {

                System.out.print(k+" ");
            }
            // second half numbers
            for(int l = 2; l <= i; l++) {
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
}

public class SolidRectangle {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        // ****solid rectangle****
        //time complexity : O(n^2) Space complexity: O(1)

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}


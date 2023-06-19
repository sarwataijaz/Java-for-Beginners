import java.util.*;
public class Transpose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and coloumns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Enter the values: ");
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose: ");

        for(int col = 0; col < m; col++) {
            for(int row = 0; row < n; row++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class SpiralMAtrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = 4;
        int n = 4;
// time complexity = O(m*n)
// space complexity = O(1)
        System.out.println("Enter the elements for 4x4 matrix: ");
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int row_start = 0;
        int col_start = 0;
        int row_end = m - 1;
        int col_end = n - 1;

        while(row_start <= row_end && col_start <= col_end) {
        int i = 1;
            for(int col = col_start; col <= col_end && i <= row_start; col++) {
                System.out.print(matrix[row_start][col] + " ");
                i++;
            }


            row_start++;

            for(int row = row_start; row <= row_end && i <= row_end; row++) {
                System.out.print(matrix[row][col_end] + " ");
            }



            col_end--;

            for(int col = col_end; col >= col_start && i <= row_end; col--) {
                System.out.print(matrix[row_end][col] + " ");
            }


            row_end--;

            for(int row = row_end; row >= row_start && i <= row; row--) {
                System.out.print(matrix[row][col_start] + " ");
            }



            col_start++;

            System.out.println();
        }
    }
}

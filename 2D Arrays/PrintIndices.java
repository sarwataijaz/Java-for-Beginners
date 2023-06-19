import java.util.*;
public class PrintIndices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter a matrix: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the element you wanna search: ");
        int x = sc.nextInt();


        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == x) {
                    System.out.print(x + " is present at: (" + (i+1)+","+(j+1) + ")");
                }
            }
            System.out.println();
        }

    }
}

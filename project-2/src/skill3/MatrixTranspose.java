package skill3;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}


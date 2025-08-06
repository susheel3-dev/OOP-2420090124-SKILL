package skill3;
import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1 != r2) {
            System.out.println("Invalid dimensions");
            return;
        }
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++)
            for(int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i < r2; i++)
            for(int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                product[i][j] = 0;
                for(int k = 0; k < c1; k++)
                    product[i][j] += a[i][k] * b[k][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

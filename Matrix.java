import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, c;
        System.out.print("Enter row number: ");
        r = input.nextInt();
        System.out.print("Enter column number: ");
        c = input.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        // int[][] sum = new int[r][c];

        System.out.println("Enter value for a matrix:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.printf("a[%d][%d]: ", row, col);
                a[row][col] = input.nextInt();
            }
        }
        System.out.println("Enter value for b matrix:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.printf("b[%d][%d]: ", row, col);
                b[row][col] = input.nextInt();
            }
        }

        System.out.println("VALUE OF MATRIX A:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("VALUE OF MATRIX B:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println();
        }
        /// SUM OF 2 MATRIX
        System.out.println("SUM OF MATRIX A AND B:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                // sum[row][col] = a[row][col] + b[row][col];
                System.out.print((a[row][col] + b[row][col]) + " ");
            }
            System.out.println();
        }

        /// DIAGONAl SUM OF TWO MATRIX
        int sum = 0, sum2 = 0, ss = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (row == col) /// DIAGONAL
                {
                    sum += a[row][col]; /// DIAGONAl SUM OF MATRIX A

                    // sum2 += b[row][col]; /// DIAGONAl SUM OF MATRIX B
                    // ss += a[row][col] + b[row][col]; /// DIAGONAl SUM OF MATRIX A AND B
                } else if (row < col) /// UPPER TRIANGULAR
                {
                    sum2 += a[row][col];
                } else /// LOWER TRIANGULAR
                {
                    ss += a[row][col];
                }
            }
        }
        System.out.println("DIAGONAL SUM OF MATRIX A: " + sum);
        System.out.println("SUM OF UPPER TRIANGULAR MATRIX A: " + sum2);
        System.out.println("SUM OF LOWER TRIANGULAR MATRIX A: " + ss);

        input.close();
    }

}

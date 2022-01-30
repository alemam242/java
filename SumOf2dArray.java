import java.util.Scanner;

public class SumOf2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = in.nextInt();
        System.out.print("Enter number of column: ");
        int col = in.nextInt();
        int[][] ar = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Array[" + i + "][" + j + "] : ");
                ar[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += ar[i][j];
            }
        }

        System.out.println("SUM = " + sum);
        in.close();
    }
}

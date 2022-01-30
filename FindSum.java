import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, sum = 0;
        System.out.print("Enter value of n and m: ");
        n = input.nextInt();
        m = input.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println("SUM = " + sum);

        input.close();
    }
}

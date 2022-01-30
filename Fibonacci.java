import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /// FIBONACCI
        int n, f = 0, s = 1, fibo = 0;
        System.out.print("How many number: ");
        n = input.nextInt();
        System.out.print(f + " " + s + " ");
        for (int i = 3; i <= n; i++) {
            fibo = f + s;
            System.out.print(fibo + " ");
            f = s;
            s = fibo;
        }

        /// SUM OF DIGIT
        int d, sum = 0;
        System.out.print("\n\nEnter a digit: ");
        d = input.nextInt();
        while (d != 0) {
            int tmp = d % 10;
            sum += tmp;
            d = d / 10;
        }
        System.out.print("\nSUM OF DIGIT = " + sum);

        /// REVERSE OF NUMBER
        int r, summ = 0;
        System.out.print("\n\nEnter a number: ");
        r = input.nextInt();
        int tm = r;

        /// REVERSE OF NUMBER REAL LOGIC
        while (tm != 0) {
            int tmp = tm % 10;
            summ = summ * 10 + tmp;
            tm = tm / 10;
        }
        System.out.println("Reverse number is: " + summ);

        /// PALINDROME NUMBER
        /// j number reverse korle o same hoi segula palindrome number
        /// example: 121 eta k reverse korleo 121 e hoi
        if (r == summ) {
            System.out.println(r + " is a palindrome number");
        } else {
            System.out.println(r + " is not a palindrome number");
        }

        /// ARSTRONG NUMBER
        /// jodi kono number n hoi and etar protita digit er kiub er value er jogfol
        /// n er soman hoi tahole seta ARMSSTRONG number
        /// example: jodi 121 == 1^3+2^3+1^3 erkm hoi tahole ARMSTRONG
        int arm = r, sum2 = 0;
        while (arm != 0) {
            int tmp = arm % 10;
            sum2 = sum2 + (tmp * tmp * tmp);
            arm = arm / 10;
        }
        if (r == sum2) {
            System.out.println(r + " is a armstrong number");
        } else {
            System.out.println(r + " is not a armstrong number");
        }

        input.close();
    }

}

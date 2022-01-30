import java.util.Scanner;

public class Conditional_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, large;
        System.out.print("Enter two integer number ");
        a = input.nextInt();
        b = input.nextInt();
        large = (a > b) ? a : b;
        System.out.println("Largest number is " + large);

        input.close();
    }
}

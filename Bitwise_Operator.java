import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, op;
        System.out.print("Enter two integer number ");
        a = input.nextInt();
        b = input.nextInt();
        op = a & b; // BItwise AND
        System.out.println("a & b = " + op);
        op = a | b; // BItwise OR
        System.out.println("a | b = " + op);
        op = a ^ b; // BItwise EXOR
        System.out.println("a ^ b = " + op);
        op = a >> 3; // RIGHT SHIFT
        System.out.println("a>> = " + op);
        op = a << 3; // LEFT SHIFT
        System.out.println("a<< = " + op);

        input.close();
    }
}

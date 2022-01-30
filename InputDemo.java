import java.util.Scanner; // IMPORT THIS FOR SCAN VALUE

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // // Taking string input
        String name;
        System.out.print("Enter your name: ");
        name = input.nextLine(); // nextLine() function use kore input nile space input nite pare
        System.out.println("Welcome Mr. " + name);

        System.out.print("Enter your name: ");
        name = input.next(); // next() function use kore input nile space input nite pare na
        System.out.println("Welcome Mr. " + name);

        // Taking integar input
        int number;
        System.out.print("Enter any integer: ");
        number = input.nextInt();
        System.out.println("Given number is: " + number);

        // Taking Double input
        double n;
        System.out.print("Enter any double number: ");
        n = input.nextDouble();
        System.out.println("Given number is: " + n);

        // Taking Double input
        float n2;
        System.out.print("Enter any float number: ");
        n2 = input.nextFloat();
        System.out.println("Given number is: " + n2);

        input.close();
    }
}

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] sr = { "suvo", "farhan", "anupam", "imran" }; /// ARRAY DECLARATION AND INITIALIZATION
        int sz = sr.length;
        System.out.println("Size of the string array is: " + sz);

        System.out.print("Enter size of array: ");
        int s = input.nextInt();

        int[] ar = new int[s]; /// ARRAY DECALARATION
        int sum = 0;
        Double avg;

        System.out.print("Enter " + s + " value: ");
        for (int i = 0; i < s; i++) {
            ar[i] = input.nextInt();
        }

        for (int i = 0; i < s; i++) {
            sum += ar[i];
        }

        int l = ar.length; /// SIZE OF ARRAY
        System.out.println("Size of array is: " + l);
        System.out.print("Value in the array: ");
        for (int i = 0; i < s; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\nSum of array is: " + sum);

        // avg = new Double(sum / s); /// TYPECAST FIRST WAY
        // avg = Double.valueOf(sum / s);// second way
        avg = (double) sum / (double) s;
        System.out.println("Average of array is: " + avg);

        input.close();
    }
}

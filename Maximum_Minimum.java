import java.util.Scanner;

public class Maximum_Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int s = input.nextInt();

        int[] ar = new int[s];
        System.out.print("Enter " + s + " valeu: ");
        for (int i = 0; i < s; i++) {
            ar[i] = input.nextInt();
        }

        int max = ar[0];
        int min = ar[0];
        for (int i = 1; i < s; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        input.close();
    }
}

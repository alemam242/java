import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        // EVEN OR ODD
        int number;
        System.out.print("Enter any integer: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number");
        } else {
            System.out.println(number + " is an Odd number");
        }

        // VOWEL OR CONOSNENT
        char c;
        System.out.print("Enter any character: ");
        c = input2.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is a Consonent");
        }

        // SMALL OR CAPITAL
        char ch;
        System.out.print("Enter any character: ");
        ch = input2.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a small letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a capital letter");
        } else {
            System.out.println(ch + " is not a letter");
        }

        input.close();
        input2.close();
    }
}

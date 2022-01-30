import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s1 = input.next();
        String s2;

        StringBuffer sb = new StringBuffer(s1);
        s2 = sb.reverse().toString();

        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        input.close();
    }
}

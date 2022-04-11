package finalquestion;

import java.util.*;

class InvalidNameException extends Exception {

    InvalidNameException(String msg) {
        super(msg);
    }
}

public class Question_3_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            if (str.length() < 8) {
                throw new InvalidNameException("Too Small");
            } else {
                System.out.println("All ok");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

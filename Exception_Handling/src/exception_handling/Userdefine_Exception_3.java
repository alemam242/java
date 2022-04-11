package exception_handling;

import java.util.*;

class InvalidNameException extends Exception {

    public InvalidNameException(String s) {
        super(s);
    }
}

public class Userdefine_Exception_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String name = input.nextLine();
            if (name.equals("Al Emam")) {
                System.out.println("It is valid");

            } else {
                throw new InvalidNameException("Not valid");
            }
        } catch (InvalidNameException e) {
            System.out.println(e);
        }
    }
}

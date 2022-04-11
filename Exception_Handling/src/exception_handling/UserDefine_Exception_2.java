package exception_handling;
import java.util.*;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class UserDefine_Exception_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        int age = input.nextInt();
        if(age<18)
        {
        throw new InvalidAgeException("You are not eligible to cast your vote");
        }
        else
        {
            System.out.println("You are eligible");
        }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
    }
}

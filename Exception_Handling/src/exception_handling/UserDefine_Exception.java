package exception_handling;
import java.util.*;

class AgeException extends Exception{
    public AgeException(String s)
    {
        super(s);
    }
}
public class UserDefine_Exception {
    void Check(int age) throws AgeException{
        if(age<18)
        {
            throw new AgeException("You are not eligible to cast your vote");
        }
    }
    
    public static void main(String[] args) {
        UserDefine_Exception ob = new UserDefine_Exception();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        try{
            ob.Check(a);
            System.out.println("You are eligible");
        } 
        catch(AgeException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

package solved_questions_42;
import java.util.*;

class NameException extends Exception
{
    NameException(String s)
    {
        super(s);
    }
}
public class Question_3_a {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        try{
        if(name.length()<8)
        {
            throw new NameException("Too small");
        }
        else
        {
            System.out.println("All okay");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

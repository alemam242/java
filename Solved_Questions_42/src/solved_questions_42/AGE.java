package solved_questions_42;

import java.util.Scanner;
class AgeException extends Exception
{
    AgeException(String s)
    {
        super(s);
    }
}

public class AGE {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try{
            if(age>=18)
            {
                System.out.println("You Are Illegebale for vote");
            }
            else
            {
                throw new AgeException("Not Eligible for voting");
            }
        }
        catch(AgeException e)
        {
            System.out.println(e);
        }
    }
}

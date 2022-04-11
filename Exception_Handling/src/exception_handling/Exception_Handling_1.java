package exception_handling;
import java.util.*;

public class Exception_Handling_1
{
    public static void main(String[] args)
    {
        // Arithmetic exception
        int a,b,c;
        Random r = new Random();
        for(int i=0;i<10;i++)
        {
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Divided by zero is not possible");
                a=0;
            }
            System.out.println("a = "+a);
        }
    }
}

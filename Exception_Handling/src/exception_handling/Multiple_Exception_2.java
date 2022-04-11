package exception_handling;

public class Multiple_Exception_2 {
    public static void main(String[] args) {
        
        try{
        int a = args.length;
        System.out.println("a = "+a);
        int b = 42/a;
        int c[] = {1};
        c[42]=b;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds " +e);
        }
        catch(Exception e)
        {
            System.out.println("Another exception "+e);
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}

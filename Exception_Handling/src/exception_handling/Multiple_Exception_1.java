package exception_handling;

public class Multiple_Exception_1 {
    public static void main(String[] args) {
        try{
        int a = args.length;
        System.out.println("a = "+a);
        int b = 42/a;
        int c[] = {1};
        c[42]=b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by zero not possible" +e);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array index out of bounds "+ex);
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}

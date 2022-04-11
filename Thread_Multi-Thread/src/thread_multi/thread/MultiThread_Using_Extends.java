package thread_multi.thread;

class Cube extends Thread
{
    int n;
    Cube(int x)
    {
        n=x;
    }
    @Override
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("Cube of "+i+": "+(i*i*i));
        }
        System.out.println("Exit from Cube");
    }
}
class Square extends Thread
{
    int n;
    Square(int x)
    {
        n=x;
    }
    @Override
    public void run()
    {
        for(int i=0;i<=n;i++)
        {
            System.out.println("Square of "+i+": "+(i*i));
        }
        System.out.println("Exit from Square");
    }
}
public class MultiThread_Using_Extends {
    public static void main(String[] args) {
        Cube C = new Cube(10);
        Square S = new Square(10);
        C.setPriority(4);
        S.setPriority(2);
        try{
        C.start();
        S.start();
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        System.out.println("Exit from main method");
    }
}

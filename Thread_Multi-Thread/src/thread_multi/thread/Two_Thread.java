package thread_multi.thread;
class Fibo extends Thread
{
    private int size;
    Fibo(int x)
    {
        size=x;
    }
    public void run()
    {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<size;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.println();
    }
}
class harmonic extends Thread
{
    private int size;
    harmonic(int x)
    {
        size=x;
    }
    public void run()
    {
        System.out.print("1");
        for(int i=2;i<=size;i++)
        {
            System.out.print(" + 1/"+i);
            
        }
        System.out.println();
    }
}
public class Two_Thread {
    public static void main(String[] args) {
        Fibo ob = new Fibo(10);
        harmonic ob2 = new harmonic(10);
        
        ob.setPriority(6);
        ob.start();
        ob2.setPriority(2);
        ob2.start();
    }
}

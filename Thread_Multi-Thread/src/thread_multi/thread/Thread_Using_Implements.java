package thread_multi.thread;
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("New thread A using implements");
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("New thread B using implements");
    }
}
public class Thread_Using_Implements {
    public static void main(String[] args) {
        A ob = new A();
        Thread T1 = new Thread(ob);

        B ob2 = new B();
        Thread T2 = new Thread(ob2);
        
        T1.start();
        T2.start();
    }
}

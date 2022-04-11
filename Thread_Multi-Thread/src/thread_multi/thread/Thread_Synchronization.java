package thread_multi.thread;

class Global
{
    synchronized void callme(String msg)
    {
        System.out.print("["+msg);
        try{
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class caller implements Runnable
{
    String msg;
    Global call;
    Thread Th;
    public caller(Global gb,String s)
    {
        call = gb;
        msg=s;
        Th = new Thread(this);
        Th.start();
    }
    public void run()
    {
        call.callme(msg);
    }
}
public class Thread_Synchronization {
    public static void main(String[] args) {
        Global obj = new Global();
        caller obj1 = new caller(obj, "Hello");
        caller obj2 = new caller(obj, "Java");
        caller obj3 = new caller(obj, "Programmer");
        
        try
        {
            obj1.Th.join();
            obj2.Th.join();
            obj3.Th.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
package thread_multi.thread;
class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("From MyThread class");
        }
    }
}
public class Thread_Using_Extends {

    public static void main(String[] args) {
        MyThread ob = new MyThread();
        ob.start();
    }
}

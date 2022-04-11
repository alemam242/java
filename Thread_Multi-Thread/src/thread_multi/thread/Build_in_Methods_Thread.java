package thread_multi.thread;
class Thread_1 extends Thread
{
    public void run()
    {
        System.out.println("ok");
    }
}

public class Build_in_Methods_Thread {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println(th);
        th.setName("Main_Method");
        th.setPriority(Thread.NORM_PRIORITY);
        System.out.println(th);
    }
}


package thread_multi.thread;

class Sync{
    int count=0;
    public synchronized void increase()
    {
        count++;
    }
}
public class Synchronized_block {
    public static void main(String[] args) throws Exception{
        Sync ob = new Sync();
        Thread  t1=new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<100;i++)
                ob.increase();
            }
        });
        Thread  t2=new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<100;i++)
                ob.increase();
            }
        });
        
        t1.start();
        t2.start();
        System.out.println(ob.count);
    }
}

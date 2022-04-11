
package solved_questions_42;

public class two_thread {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
           public void run()
           {
               for(int i=0;i<1000;i++)
               {
                   int tmp = i,a,sum=0;
                   while(tmp>0)
                   {
                       a=tmp%10;
                       sum= sum+(a*a*a);
                       tmp=tmp/10;
                   }
                   if(sum==i)
                   {
                       System.out.println("Armstrong: "+i);
                   }
               }
           }
        });
        Thread t2 = new Thread(new Runnable(){
           public void run()
           {
               for(int i=0;i<1000;i++)
               {
                   int tmp = i,a,rev=0;
                   while(tmp>0)
                   {
                       a=tmp%10;
                       rev= rev*10+a;
                       tmp=tmp/10;
                   }
                   if(rev==i)
                   {
                       System.out.println("Palindrome: "+i);
                   }
               }
           }
        });
        
        
        t1.start();
        
        t1.setPriority(Thread.MAX_PRIORITY);
        
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

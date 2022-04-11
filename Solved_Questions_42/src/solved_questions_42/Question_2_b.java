package solved_questions_42;

import java.util.*;

public class Question_2_b {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    if(i%2==1)
                    {
                        System.out.println(i);
                    }
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
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

package finalquestion;

public class Question_2_b_b {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<=50;i++)
                {
                    if(i%2==1)
                    {
                        System.out.println("Odd: " +i);
                    }
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<=50;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println("Even: " +i);
                    }
                }
            }
        });
        
        t1.setPriority(6);
        t2.setPriority(3);
        
        t1.start();
        t2.start();
    }
}

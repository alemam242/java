package solved_questions_42;


public class Question_4_a {
    public static void main(String[] args) {
        String str = "apple";
        int max=0,count;
        char c='\0';
        
        for(int i=0;i<str.length();i++)
        {
            count=0;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                c=str.charAt(i);
            }
        }
        
        System.out.println("Repeted character: "+c);
        
    }
}

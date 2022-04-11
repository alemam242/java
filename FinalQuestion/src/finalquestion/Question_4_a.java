
package finalquestion;
import java.util.*;
public class Question_4_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int max=0,count;
        char res='\0';
        
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
                res = str.charAt(i);
            }
        }
        
        System.out.println(res);
    }
}

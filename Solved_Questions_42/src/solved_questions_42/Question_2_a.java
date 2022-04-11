package solved_questions_42;
import java.util.*;
/**
 * @author SUVO
 */
public class Question_2_a {

    public static void main(String[] args) {
        Stack<Float> st = new Stack<>();
        st.add(1.26f);
        st.add(2.36f);
        st.add(3.25f);
        st.add(4.63f);
        st.add(5.74f);
        
        int option;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            option=sc.nextInt();
            if(option==1)
            {
                System.out.print("Enter value to insert: ");
                st.add(sc.nextFloat());
            }
            else if(option==2)
            {
                if(!st.isEmpty())
                {
                System.out.println(st.peek() + " Deleted from list");
                st.pop();
                }
                else
                {
                    System.out.println("List is Empty");
                }
            }
            else if(option ==3)
            {
                if(!st.isEmpty())
                {
                System.out.println("Top Element: "+st.peek());
                }
                else
                {
                    System.out.println("List is empty");
                }
            }
            else
            {
                break;
            }
        }
        
        
    }
    
}

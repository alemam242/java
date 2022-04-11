package solved_questions_42;
import java.util.*;
class course
{
    String name,code;
    double credit;
    course(String n,String c,double cr)
    {
        name=n;
        code=c;
        credit=cr;
    }
}
public class Question_3_b {
    public static void main(String[] args) {
        course ob1 = new course("Data Communication","CSE 209",3.00);
        course ob2 = new course("Advance Programming JAVA","CSE 331",3.00);
        course ob3 = new course("Advance Programming lab JAVA","CSE 332",1.5);
        course ob4 = new course("Algorithm","CSE 211",3.00);
        course ob5 = new course("Algorithm lab","CSE 212",1.5);
        
        ArrayList<course> ar = new ArrayList<>();
        
        ar.add(ob1);
        ar.add(ob2);
        ar.add(ob3);
        ar.add(ob4);
        ar.add(ob5);
        
        for(course x:ar)
        {
            if(x.credit>1.5)
            {
                System.out.println(x.name+" "+x.code+" "+x.credit);
            }
        }
    }
}

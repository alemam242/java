
package finalquestion;

import java.util.*;

class Course
{
    String name,code;
    double credit;
    
    Course(String n,String c,double cr)
    {
        name=n;
        code=c;
        credit=cr;
    }
}
public class Question_3_b {
    public static void main(String[] args) {
        Course ob1 = new Course("Numerical analysis","CSE 224",1.75);
        Course ob2 = new Course("Data Communication","CSE 209",3.00);
        Course ob3 = new Course("Computer Architecture","CSE 215",3.00);
        Course ob4 = new Course("Advance Programming Language","CSE 331",3.00);
        Course ob5 = new Course("Advance Programming Language Lab","CSE 332",1.75);
        
        ArrayList<Course> al = new ArrayList<Course>();
        al.add(ob1);
        al.add(ob2);
        al.add(ob3);
        al.add(ob4);
        al.add(ob5);
        
        for(Course x:al)
        {
            if(x.credit>1.5)
            {
                System.out.println(x.name + " " + x.code + " " + x.credit);
            }
        }
    }
}

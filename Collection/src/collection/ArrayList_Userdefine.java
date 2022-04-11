package collection;

import java.util.ArrayList;

class student
{
    int id;
    String name;
    double cgpa;
    student(int id,String name,double cgpa)
    {
        this.id = id;
        this.name=name;
        this.cgpa=cgpa;
    }
}

public class ArrayList_Userdefine {
    
    public static void main(String[] args) {
        student ob = new student(1001,"Rahul",3.70);
        student ob2 = new student(1002,"Hasib",3.62);
        student ob3 = new student(1003,"Rakib",3.24);
        ArrayList<student> al = new ArrayList<student>();
        al.add(ob);
        al.add(ob2);
        al.add(ob3);
        
        for (student i:al)
        {
            if (i.cgpa < 3.50) {
                System.out.println("id: " +i.id + "\nName: " + i.name + "\nCgpa: " + i.cgpa);
            }
        }
    }
}

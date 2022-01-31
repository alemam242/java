class Student {
    String name;
    int id;
    static String University = "BUBT";

    // static variable use kora hoi memory management er jonno
    // static variable er sathe object er kono relation thake na object theke sudhu
    // refer kora hoi
    // static variable direct class er sathe related
    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University: " + University);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("AL EMAM", 242);
        Student s2 = new Student("FARHAN", 272);
        s1.display();
        s2.display();
    }
}

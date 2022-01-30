class Student {
    String name;
    int age;

    void disp() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Student {
    String gmail;

    void disp2() {
        disp();
        System.out.println("Gmail : " + gmail);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Suvo";
        t1.age = 22;
        t1.gmail = "aryansuvo017@gmail.com";
        t1.disp2();
    }
}

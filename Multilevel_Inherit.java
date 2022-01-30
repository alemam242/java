class A {
    int i;

    void show(int a) {
        i = a;
        System.out.println("i = " + i);
    }
}

class B extends A {
    int j;

    void show(int a) {
        super.show(10);
        j = a;
        System.out.println("Sum f i+j = " + (i + j));
    }
}

class C extends B {
    int k;

    void show(int a) {
        super.show(20);
        k = a;
        System.out.println("Sum f i+j+k = " + (i + j + k));
    }
}

public class Multilevel_Inherit {
    public static void main(String[] args) {
        C ob = new C();
        ob.show(30);
    }
}

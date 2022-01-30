import java.util.Scanner;

class Box {
    double h, w, l;

    void setvalue(double a, double b, double c) {
        h = a;
        w = b;
        l = c;
    }

    double getvalue() {
        return h * w * l;
    }
}

public class VolumeOfBox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of box: ");
        double a = in.nextDouble();
        System.out.print("Enter width of box: ");
        double b = in.nextDouble();
        System.out.print("Enter length of box: ");
        double c = in.nextDouble();

        Box ob = new Box();
        ob.setvalue(a, b, c);
        double V = ob.getvalue();
        System.out.println("Volume of the box is: " + V);
        in.close();
    }
}

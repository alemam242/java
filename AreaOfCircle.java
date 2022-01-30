import java.util.Scanner;

class Circle {
    final double pi = 3.1416;
    double radius;

    Circle(Double r) {
        radius = r;
    }

    double getvalue() {
        return pi * (radius * radius);
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        double r = in.nextDouble();
        Circle ob = new Circle(r);
        double area = ob.getvalue();
        System.out.println("Area of the circle: " + area);
        in.close();
    }
}

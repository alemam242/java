import java.util.Scanner;

public class Area_and_Perimeter {
    public static void main(String[] args) {
        /*
         * Figure Area_Formula Perimeter_Formula
         * Square A = S*S P = 4*s
         * Rectangle A = l*w P = 2*(l+w)
         * Triangle A = (1/2)*b*h P = a+b+c
         * Circle A = pi*r*r P = 2*pi*r
         ** pi = 3.1416
         */

        Scanner input = new Scanner(System.in);

        // Area and Perimeter of Square
        double Area, length_of_Side, perimeter;
        System.out.print("Enter length of side of the square: ");
        length_of_Side = input.nextDouble();
        Area = length_of_Side * length_of_Side;
        perimeter = 4 * length_of_Side;
        System.out.println("Area of square = " + Area);
        System.out.println("Perimeter of square = " + perimeter);

        // Area and Perimeter of Rectangle
        double length, width;
        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();
        Area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("Area of Rectangle = " + Area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        // Area and Perimeter of Triangle
        double a, b, c, h;
        /*
         * a,c = sides
         * b = base
         * h = height
         */
        System.out.print("Enter side of Triangle: ");
        a = input.nextDouble();
        c = input.nextDouble();
        System.out.print("Enter base of Triangle: ");
        b = input.nextDouble();
        System.out.print("Enter height of Triangle: ");
        h = input.nextDouble();
        Area = 0.5 * b * h;
        perimeter = a + b + c;
        System.out.println("Area of Triangle = " + Area);
        System.out.println("Perimeter of Triangle = " + perimeter);

        // Area and Perimeter of Circle
        double radius;
        System.out.print("Enter radius of circle: ");
        radius = input.nextDouble();
        Area = 3.1416 * radius * radius;
        perimeter = 2 * 3.1416 * radius;
        System.out.println("Area of circle = " + Area);
        System.out.println("Perimeter of circle = " + perimeter);

        input.close();
    }
}

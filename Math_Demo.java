public class Math_Demo {
    public static void main(String[] args) {
        int a = 19, b = 12, c = -18;
        int max, min, round, absolute;
        double root, pi, square, e;
        float d = 9.2f;
        max = Math.max(a, b);
        min = Math.min(a, b);
        square = Math.pow(a, b);
        pi = Math.PI;
        e = Math.E;
        root = Math.sqrt(b);
        absolute = Math.abs(c);
        round = Math.round(d);
        System.out.println("Maximum = " + max);
        System.out.println("Minnimum = " + min);
        System.out.println("Square = " + square);
        System.out.println("PI = " + pi);
        System.out.println("E = " + e);
        System.out.println("Root = " + root);
        System.out.println("Absolute = " + absolute);
        System.out.println("round = " + round);
    }
}

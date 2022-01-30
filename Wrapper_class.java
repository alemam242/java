public class Wrapper_class {
    public static void main(String[] args) {
        // wrapper class er kaj hocche premetive data tye theke object
        // and object theke premetive a ruantirito kora

        /**
         * Function of wraper class
         * auoboxing -> premetive data tye theke object a ruantirito kore
         * unboxing -> object theke premetive datatype a rupantirito kora
         */

        // premetive data tye theke object
        int n = 100;
        Integer i = Integer.valueOf(n);
        Integer j = n;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        char c = 'S';
        Character s = Character.valueOf(c);
        System.out.println("s = " + s);

        // object theke premetive datatype
        Double d = 12.25;
        double e = d.doubleValue();
        // double e = d;
        System.out.println("e = " + e);

        Character z = 'X';
        char v = z.charValue();
        System.out.println("z = " + v);
    }
}

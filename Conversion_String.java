public class Conversion_String {
    public static void main(String[] args) {

        /* String to premetive datatype */

        // int to string coonversion
        int i = 100;
        String s = Integer.toString(i);
        System.out.println(s);

        // double to string coonversion
        double d = 80.23;
        String s1 = Double.toString(d);
        System.out.println(s1);

        // boolean to string coonversion
        boolean b = true;
        String s2 = Boolean.toString(b);
        System.out.println(s2);
        /*------------------------------*/

        /* Premetive datatype to String */

        // String to int
        String ss = "200";
        int ii = Integer.parseInt(ss); // evabe o kora jai
        int iii = Integer.valueOf(ss); // evabe o kora jai
        System.out.println(ii);
        System.out.println(iii);

        // String to Double
        double dd = Double.valueOf(ss);
        System.out.println(dd);
    }
}

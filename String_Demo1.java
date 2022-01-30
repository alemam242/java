public class String_Demo1 {
    public static void main(String[] args) {

        /**
         * functions are
         * length()
         * equals()
         * equalsIgnoreCase()
         * contains()
         * isEmpty()
         */

        /// STREING declaration
        String s1 = "AL EMAM";
        String s2 = new String("al emam"); // object create kore string declaration

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // usase of length function
        int len = s1.length();
        int len2 = s2.length();

        System.out.println("Length of s1 = " + len);
        System.out.println("Length of s2 = " + len2);

        /// checking strings are equal or not
        if (s1.equals(s2)) // evabe check korle capital letter small letter matter kore
        {
            System.out.println("BOTH ARE EQUAL");
        } else {
            System.out.println("BOTH ARE NOT EQUAL");
        }

        if (s1.equalsIgnoreCase(s2)) // evabe check korle capital letter small letter matter kore na
        {
            System.out.println("BOTH ARE EQUAL");
        } else {
            System.out.println("BOTH ARE NOT EQUAL");
        }

        /// checking given substring are available in the string or not
        if (s2.contains("emam")) // check kortesi "emam" substring ta s2 er moddhe ache kina
        {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }

        boolean chk = s1.equals(s2); // checking s1 anfd s2 are equals or not
        System.out.println(chk);

        boolean b = s1.equalsIgnoreCase(s2); // checking s1 anfd s2 are equals or not
        System.out.println(b);

        // usase of isEmpty function
        boolean e = s2.isEmpty();
        if (e) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}

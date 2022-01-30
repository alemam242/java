public class string_Demo2 {
    public static void main(String[] args) {
        /**
         * functions are
         * concat()
         * toUperCase()
         * toLowerCase()
         * startsWith()
         * endsWith()
         */

        String fn = "Alemam";
        String ln = " Suvo";
        String fullname = fn + ln; // evabe 2 ta string add kora jai
        System.out.println("Full name = " + fullname);

        String fnm = "FARHAN";
        String lnm = " ISRAQ";
        // usase of concat() function
        String fullnm = fnm.concat(lnm); // concat function use kore 2 ta string add kora
        System.out.println("Full name = " + fullnm);

        /// usase 0f toUpperCase() function
        String upper = fn.toUpperCase();
        System.out.println("NAME = " + upper);

        /// usase 0f toLowererCase() function
        String lower = fnm.toLowerCase();
        System.out.println("NAME = " + lower);

        /// usase 0f startsWith() function
        boolean start = fn.startsWith("Al");
        System.out.println(start);

        /// usase 0f endsWith() function
        boolean end = fnm.endsWith("HAN");
        System.out.println(end);
    }

}

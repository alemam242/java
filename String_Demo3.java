public class String_Demo3 {
    public static void main(String[] args) {
        /**
         * functions are
         * charAt()
         * codePointAt()
         * trim()
         * indexOf()
         * lastIndexOf()
         */

        String fn = "    I love      my Country    ";

        System.out.println("First name = " + fn);

        // usase of trim() function
        String fnm = fn.trim(); // trim er kaj hocche kono string er first er and last er space gulo remove kore
                                // dea
        System.out.println("Edited string using trim function  = " + fnm);

        // usase of charAt() function
        char ch = fnm.charAt(0); // charAt(n) n tomo index a ki value ache seta
        System.out.println("ch = " + ch);

        // usase of codePointAt() function
        int ascii = fn.codePointAt(3); // 3 number index er character er ascii value koto
        System.out.println("Ascii value = " + ascii);

        // usase of indexOf() function
        int in = fn.indexOf('m'); // kono string er moddhe first 'm' koto number index a ache
        System.out.println("Index of 'm' = " + in);

        // usase of lastIndexOf() function
        int lin = fn.lastIndexOf('m'); // kono string er moddhe last 'm' koto number index a ache
        System.out.println("last Index of 'm' = " + lin);
    }

}

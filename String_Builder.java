public class String_Builder {
    public static void main(String[] args) {
        /**
         * StringBuffer and StringBuilder same
         * sudhu declaration ta alada
         */

        StringBuilder sb = new StringBuilder("Alemam");
        System.out.println(sb);

        // usase of append() function
        // apend function use kore ekadhik string add kora jai
        sb.append(" Suvo ");
        sb.append(242);

        System.out.println(sb);

        // usase of setLength() function
        sb.setLength(4); // first er 4 ta digit print korbe
        System.out.println(sb);

        // usase of delete function
        String s = "Alemam";
        StringBuilder sb2 = new StringBuilder(s);
        sb2.delete(0, 2);
        System.out.println(sb2);

        // usase of reverse function
        String s3 = "Alemam";
        StringBuilder sb3 = new StringBuilder(s3);
        sb3.reverse();
        System.out.println(sb3);
    }
}

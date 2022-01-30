public class String_Demo4 {
    public static void main(String[] args) {
        /**
         * functions are
         * replace()
         * split()
         */

        String s1 = "Bangladesh is my country";
        System.out.println("String = " + s1);

        // usase of replace function
        String s2 = s1.replace('a', '*'); // string er moddhe jesob jaigai a thakbe sesob jaigai * hoye jabe
        System.out.println("Replaced string = " + s2);
        System.out.println();

        // usase of split() function
        // split function diye kono string k substring kora jai
        // r substring gulo store korar jonno string array lage
        String[] s3 = s1.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }
    }

}

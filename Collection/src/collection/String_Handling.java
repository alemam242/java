package collection;


public class String_Handling {
    public static void main(String[] args) {
        String str1 = "Good";
        String str2 = "bad";
        String str3 = "good";
        
        System.out.println(str1.equals(str2)); // usase equals
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3)); // usase equalsIgnoreCase
    }
}

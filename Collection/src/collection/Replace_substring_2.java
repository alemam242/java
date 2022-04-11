
package collection;

public class Replace_substring_2 {
    public static void main(String[] args) {
        String str1="Hi";
        String str2="Bangladesh";
        
        if(str2.length()>10)
        {
            String str3 = str2.substring(4, 7);
            str2 = str2.replace(str3, "good");
            System.out.println(str2);
        }
        else
        {
            str2 = str1.concat(str2);//str2+str1;
            System.out.println(str2);
        }
    }
}


package collection;

public class Replace_substring_3 {
    public static void main(String[] args) {
        String str1="Hi";
        String str2="Bangladesh";
        
        if(str2.length()==str1.length())
        {
            str2 = str2+str1;
            System.out.println(str2);
            
        }
        else
        {
            String str3 = "desh";
            str2 = str2.replace("desh", "");
            System.out.println(str2);
        }
    }
}

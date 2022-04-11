
package collection;

public class Replace_substring {
    public static void main(String[] args) {
        String str1="wash";
        String str2="Hi Bangladesh";
        for(int i=str1.length()-1;i>=0;i--)
        {
            char c=str1.charAt(i);
            System.out.print(c);
        }
        System.out.println();
        if(str2.length()>=10)
        {
            String str3 = str2.substring(9, 12);
            str2 = str2.replace(str3, str1);
            System.out.println(str2);
        }
        else
        {
            str2 = str2+str1;
            System.out.println(str2);
        }
        
//        str2.reverse();
//        str2.delete(2,4);
    }
}

package collection;

public class SortString {
    public static void main(String[] args) {
        String str[] = {"Orange","Mango","Banana","Apple","Lemon"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[j].compareToIgnoreCase(str[i])<0)
                {
                    String t = str[i];
                    str[i] = str[j];
                    str[j]=t;
                }
            }
            System.out.println(str[i]);
        }
    }
}

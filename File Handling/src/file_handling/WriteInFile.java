package file_handling;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
        int id;
        String name;
        try{
            Formatter formatter = new Formatter("C:/Users/aryan/Desktop/6th semester/cse 331 & 332-(Advanced Programming)/New File/text1.txt");
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                id=sc.nextInt();
            name = sc.nextLine();
            formatter.format("%d %s\r\n",id,name);
            }
            formatter.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}

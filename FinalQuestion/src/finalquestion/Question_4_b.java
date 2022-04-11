
package finalquestion;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Question_4_b {
    public static void main(String[] args) {
        File file = new File("C:/Users/aryan/Desktop/6th semester/cse 331 & 332-(Advanced Programming)/New File/input.txt");
        String sen;
        try{
            file.createNewFile();
            System.out.print("Enter sentense: ");
            Scanner sc = new Scanner(System.in);
            sen=sc.nextLine();
            
            Formatter frm = new Formatter(file.getAbsolutePath());
            frm.format("%s\r\n", sen);
            frm.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

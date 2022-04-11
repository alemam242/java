
package file_handling;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try{
            File f = new File("C:/Users/aryan/Desktop/6th semester/cse 331 & 332-(Advanced Programming)/New File/text1.txt");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext())
            {
                int id = sc.nextInt();
                String name = sc.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

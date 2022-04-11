package solved_questions_42;
import java.util.*;
import java.io.*;

public class Question_4_b {
    public static void main(String[] args) {
        try{
        File f = new File("input.txt");
        f.createNewFile();
            System.out.print("Sentence: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            
            Formatter fr = new Formatter(f.getAbsolutePath());
            fr.format("%s\r\n", s);
            
            fr.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}

package file_handling;

import java.io.*;
import java.util.*;

public class File_Solve {
    public static void main(String[] args) {
        String name;
        try{
            File f = new File("output.txt");
            f.createNewFile();
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            
            Formatter fr = new Formatter(f.getAbsolutePath());
            fr.format("%s\r\n", name);
            fr.close();
            
            System.out.println("File Created");
            
            //** File Read method**//
            sc = new Scanner(f);
            while(sc.hasNext())
            {
                name=sc.nextLine();
                System.out.println("From file: "+name);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

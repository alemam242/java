
package file_handling;

import java.io.File;

public class File_Create_Demo {

    public static void main(String[] args) {
        File dir = new File("C:/Users/aryan/Desktop/6th semester/cse 331 & 332-(Advanced Programming)/New File"); //set location and name of folder
        dir.mkdir(); // make folder 
        String path = dir.getAbsolutePath(); //folder path
        System.out.println(path);
        System.out.println(dir.getName()); //name of folder
        
        File file1 = new File(path+"/text1.txt"); // set name of txt file
        File file2 = new File(path+"/text2.txt");
        try{
            file1.createNewFile(); // create txt file
            file2.createNewFile();
            
            System.out.println("Files are created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        if(file1.exists()) // checking the file is exists or not
        {
            System.out.println("File1 exists");
        }
        else
        {
            System.out.println("File1 not exists");
        }
        
        file2.delete(); // delete txt file
        
        if(file2.exists())
        {
            System.out.println("File2 exists");
        }
        else
        {
            System.out.println("File2 not exists");
        }
        
        dir.delete(); // delete the folder
    }
    
}

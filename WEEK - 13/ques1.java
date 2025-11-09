package week_13;

import java.io.File;
public class ques1 {
    public static void main(String[] args) throws Exception {
        File f = new File("newFile.txt");
        if (f.createNewFile()){
            System.out.println("New file created");
        }
        else
            System.out.println("File already exists");
    }
    
}

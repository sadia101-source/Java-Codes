package week_13;

import java.io.*;
public class ques4 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("Line.txt");
        int c = fr.read();
        int count = 0;
        while(c>=0){
            count++;
            c = fr.read();
        }
        
        fr.close();
        System.out.println("File has " + count + " characters");
    }  
}
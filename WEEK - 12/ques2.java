package week_12;

import java.io.*;
import java.io.FileReader;
public class ques2 {
    public static void f3 () throws FileNotFoundException{
        FileReader f = new FileReader("DoesNotExist.txt");
    }
    public static void f2 () throws  FileNotFoundException {
        f3();
    }
    public static void f1 (){
        try {
            f2();
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
    
    public static void main(String[] args) {
        f1();
    } 
}
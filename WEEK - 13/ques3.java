package week_13;

import java.io.*;
public class ques3 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("FileA.txt");
        int c = fr.read();
        FileWriter fw = new FileWriter("FileB.txt");
        while (c>=0){
            fw.write(c);
            c = fr.read();
        }
        fr.close();
        fw.close();
    }
    
}
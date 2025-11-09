package week_13;

import java.io.BufferedReader;
import java.io.FileReader;
public class ques5 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("Lines.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0 ;
        String s = br.readLine();
        while (s != null) {
            count++;
            s = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("Number of lines = " + count);
    }
}
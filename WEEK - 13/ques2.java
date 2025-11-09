package week_13;

import java.io.FileWriter;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter input: ");
            String s = sc.nextLine();
            writer.write(s);
            writer.write("This is an example of writing into a file using Java.\n");
            writer.write("File handling in Java is simple using FileWriter class.");


            writer.close();

            System.out.println("Successfully wrote to the file.");
        } 
        catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
} 

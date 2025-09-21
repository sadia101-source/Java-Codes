package week_7;

import java.util.Scanner;
public class rev_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        scan.close();
        
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}

package Week_4;

import java.util.Scanner;
public class Vowel_Cons {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scan.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel.");
            } else{
                System.out.println(ch + " is a consonant.");
            }
        } else{
            System.out.println("Invalid input! Please enter an alphabet character.");
        }

        scan.close();
    }
}
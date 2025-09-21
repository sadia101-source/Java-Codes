package Week_5;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int rev = 0;
        int original = n;
        
        while (n != 0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        }
        
        System.out.println("The reverse of "+ original +" is "+ rev + ".");
        if (rev==original){
            System.out.println(original + " is a Palindrome.");
        }else{
            System.out.println(original+" is not a Palindrome.");
        }
        
        scan.close();
    }
}
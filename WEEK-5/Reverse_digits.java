package Week_5;

import java.util.Scanner;
public class Reverse_digits {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        int reverse = 0;
        int original = num;
        
        while (num != 0){
            int digit = num%10;
            //System.out.println("num%10 does this: "+digit);
            reverse = (reverse*10) + digit;
            //System.out.println("reverse*10+digit does this: "+reverse);
            num = num/10;
            //System.out.println("num/10 does this: "+num);
        }
        
        System.out.println("The Number "+original+" reversed is: "+reverse);
        scan.close();
    }
}
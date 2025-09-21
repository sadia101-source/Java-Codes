package Week_4;

import java.util.Scanner;
public class LessThan_10 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a Number: ");
        double num = sc.nextDouble();
        
        while (num >= 10){
            System.out.println("New Value: " + num);
            num = num/2;
        }
        System.out.println("Final Value less than 10: " + num);
        
        sc.close();
    }
}
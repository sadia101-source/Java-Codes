package Week_5;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n<0){
            System.out.println("Factorial not defined for negative integers.");
        }else{
            long fact=1;
            for (int i=1; i<=n; i++){
                fact *=i;
            }
            System.out.println("Factorial of "+ n + " is "+ fact+ ".");
        }
        
        sc.close();
    }
}
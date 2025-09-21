package week_7;

import java.util.Scanner;
public class GCD {
    public static int gcdRec(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdRec(b, a % b);
    }
    
    public static int gcdIter(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        scan.close();
        
        int gcd1 = gcdIter(num1, num2);
        int gcd2 = gcdRec(num1, num2);
        
        System.out.println("\nGCD using loop: " + gcd1);
        System.out.println("GCD using recursion: " + gcd2);
    }
}

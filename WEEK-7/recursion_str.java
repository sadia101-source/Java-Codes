package week_7;

import java.util.Scanner;
public class recursion_str {
    public static long factorial(long n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}

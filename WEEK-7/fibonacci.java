package week_7;

import java.util.Scanner;
public class fibonacci {
    public static int fibonacciRec(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }
    
    public static void fibonacciIter(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci series (without recursion): ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
    
    public static void printFibonacciRec(int n) {
        System.out.print("Fibonacci series (with recursion): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }
        System.out.println();
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        scanner.close();
        
        fibonacciIter(terms);
        printFibonacciRec(terms);
    }
}

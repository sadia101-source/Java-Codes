package Week_4;

import java.util.Scanner;
public class Series_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println("Sum of the series 1 + 2 + ... + " + N + " = " + sum);

        sc.close();
    }
}

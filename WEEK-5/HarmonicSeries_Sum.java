package Week_5;

import java.util.Scanner;
public class HarmonicSeries_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }

        System.out.println("Sum of the series 1 + 1/2 + ... + 1/" + n + " = " + sum);
    }
}
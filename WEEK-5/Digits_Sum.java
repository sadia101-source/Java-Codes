package Week_5;

import java.util.Scanner;
public class Digits_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();

        int a = n;
        n = Math.abs(n);

        int sum = 0;
        while (n >0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum of digits of " + a + " = " + sum);
        
        scan.close();
    }
}

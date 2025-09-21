package Week_4;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        
        System.out.println("The factors of " + N + " are:-");
        for (int i=1; i<=N; i++){
            if (N%i == 0){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
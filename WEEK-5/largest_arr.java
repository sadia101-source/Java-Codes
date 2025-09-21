package Week_5;

import java.util.Scanner;
public class largest_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of elements you want in the array: ");
        int n = sc.nextInt();
        
        if (n<=0){
            System.out.println("Array size should be a positive number.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest number in the array is: "+ largest + ".");
        
        sc.close();
    }
}
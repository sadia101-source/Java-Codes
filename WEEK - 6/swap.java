package week_6;

import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        if (size > 1) {
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
        }
        
        System.out.println("Array after swapping the first and last elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

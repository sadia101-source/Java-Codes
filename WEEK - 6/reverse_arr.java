package week_6;

import java.util.Scanner;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


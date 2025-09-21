package week_6;

import java.util.Scanner;
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
    }
}

package week_6;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
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
        System.out.print("Enter the element to search: ");
        int target = scan.nextInt();
        scan.close();
        
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + index);
        }
    }
}


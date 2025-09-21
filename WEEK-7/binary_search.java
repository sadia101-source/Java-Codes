package week_7;

import java.util.Arrays;
import java.util.Scanner;
public class binary_search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:-");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        scanner.close();
        
        int result = binarySearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

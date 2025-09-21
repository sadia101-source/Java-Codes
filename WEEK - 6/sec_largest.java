package week_6;

import java.util.Scanner;
public class sec_largest {
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
        
        if (size < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            
            for (int i = 0; i < size; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest element is: " + secondLargest);
            }
        }
    }
}

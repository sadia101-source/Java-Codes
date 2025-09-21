package week_7;

import java.util.Scanner;
public class sorted_Arr {
    public static void sortAscending(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Array Size: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter "+n+" elements:-");
        
        for (int i=0; i<n; i++){
            System.out.print("Enter element "+(i+1)+": ");
            numbers[i]=scan.nextInt();
        }
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        sortAscending(numbers);
        
        System.out.println("\nSorted array in ascending order:-");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

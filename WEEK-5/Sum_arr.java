package Week_5;

import java.util.Scanner;
public class Sum_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Array length: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter "+N+" array elements: ");
        
        for (int i = 0; i<arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        int sum = 0;
        for (int num:arr){
            sum += num;
        }
        
        System.out.println();
        System.out.println("The Sum of the elements in the array is: " + sum);
        sc.close();
    }
}

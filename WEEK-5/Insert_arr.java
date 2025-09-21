package Week_5;

import java.util.Scanner;
public class Insert_arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter desired array length: ");
        int N = scan.nextInt();
        int[] arr = new int[N];
        System.out.println("Array length is: "+ arr.length);
        
        for (int i=0; i<arr.length; i++){
            arr[i] = ((i+1)*10);
        } 
        System.out.println("Array elements: ");
        for (int num : arr){
            System.out.print(num+" ");
        }
        scan.close();
    }
}

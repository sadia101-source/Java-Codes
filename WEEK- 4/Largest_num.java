package Week_4;

import java.util.Scanner;
public class Largest_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();

        int largest;
        if (num1>=num2 && num1 >=num3){
            largest = num1;
        }else if (num2 >= num1 && num2 >= num3){
            largest = num2;
        } else{
            largest = num3;
        }
        
        System.out.println("The largest number: " + largest);

        scan.close();
    }
}
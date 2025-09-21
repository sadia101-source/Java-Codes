package Week_4;

import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        
        if ((year%400==0) || (year%4==0 && year%100 != 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap");
        }
        
        sc.close();
    }
}
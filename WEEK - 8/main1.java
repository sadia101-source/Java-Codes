package week8;

import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        //using three argument constructor
        System.out.println("For apple: ");
        System.out.println("Enter color: ");
        String c1=sc.next();
        System.out.println("Enter price: ");
        int p1=sc.nextInt();
        System.out.println("Enter taste: ");
        String t1=sc.next();
        FRUIT1 apple = new FRUIT1(c1,t1,p1);
        apple.display();
        
        //using two argument constructor
        System.out.println("");
        System.out.println("For mango: ");
        System.out.println("Enter taste: ");
        String t2=sc.next();
        System.out.println("Enter price: ");
        int p2=sc.nextInt();
        FRUIT1 mango=new FRUIT1(t2,p2);
        System.out.println("Enter color: ");
        String c2=sc.next();
        mango.setDetails(c2,t2,p2);
        mango.display();
        
        //using one argument constructor
        System.out.println("");
        System.out.println("For peach: ");
        System.out.println("Enter color: ");
        String c3=sc.next();
        FRUIT1 peach=new FRUIT1(c3);
        peach.display(); 
        
        //using constructor-chaining
        System.out.println("");
        System.out.println("For orange: ");
        FRUIT1 orange= new FRUIT1(100);
        orange.display();
    }
}
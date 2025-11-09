package week8;

import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("First car: ");
        System.out.println("Enter model: ");
        String m1=sc.next();
        System.out.println("Enter color: ");
        String color1=sc.next();
        CAR c1=new CAR(m1,color1,0);
        System.out.println("Enter price in lakhs: ");
        double p1=sc.nextDouble();
        c1.setPrice(p1);
        c1.display();
        
        System.out.println("");
        System.out.println("Second car: "); 
        System.out.println("Enter model: ");
        String m2=sc.next();
        CAR c2=new CAR (m2);
        System.out.println("Enter color: ");
        String color2=sc.next();
        c2.setColor(color2);
        System.out.println("Enter price in lakhs: ");
        double p2=sc.nextDouble();
        c2.setPrice(p2);
        c2.display();
        
        System.out.println("");
        System.out.println("Third car: ");
        System.out.println("Enter model: ");
        String m3=sc.next();
        System.out.println("Enter color: ");
        String color3=sc.next();
        CAR c3=new CAR(m3,color3);
        System.out.println("Enter price in lakhs: ");
        double p3=sc.nextDouble();
        c3.setPrice(p3);
        c3.display();
        
    }
    
}
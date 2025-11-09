package WEEK_8;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        FRUIT apple=new FRUIT();
        System.out.println("Enter color of apple: ");
        String s1=sc.next();
        apple.color= s1;
        System.out.println("Enter price: ");
        int p1=sc.nextInt();
        apple.price=p1;
        System.out.println("Enter taste: ");
        String t1=sc.next();
        apple.taste=t1;
        System.out.println("For apple: ");
        apple.display();
        
        FRUIT mango=new FRUIT();
        mango.color= "yellow";
        mango.price=150;
        mango.taste="Sweet";
        System.out.println("");
        System.out.println("For mango: ");
        mango.display();
        
        FRUIT peach=new FRUIT();
        peach.color= "Red-yellow";
        peach.price=200;
        peach.taste="Sour";
        System.out.println("");
        System.out.println("For peach: ");
        peach.display();   
    }
}
package week_12;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    
}
 
public class ques4 {
    
    public static void ValidateAge (int a) throws InvalidAgeException{
        if (a<18)
            throw new InvalidAgeException();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age to vote: ");
        int age = sc.nextInt();
        try{
           ValidateAge(age);
           System.out.println("You may vote");
        }
        catch (InvalidAgeException e){
            System.out.println("Must be 18 or above to vote");
        }
        System.out.println("Voting closed");
    }
    
}

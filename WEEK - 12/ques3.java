package week_12;

import java.util.Scanner;
class InsufficientFundsException extends Exception{
    
}

public class ques3 {
    public static double withdraw (double amount, double balance) throws InsufficientFundsException{
        if (amount>balance)
            throw new InsufficientFundsException();
        else
            return balance-amount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        try {
            balance = withdraw(amount,balance);
        }
        catch (InsufficientFundsException e){
            System.out.println("Insufficient amount in account");
        }
        System.out.println("Current balance = " + balance);
    }
    
}
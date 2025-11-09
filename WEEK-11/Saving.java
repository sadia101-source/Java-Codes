package week_11;

public class Saving implements Account{
   public void deposit(double amount){
       System.out.println("Amount " + amount + " deposited in savings account");
   } 
   
   public void withdraw(double amount){
       System.out.println("Amount " + amount + " withdrawn from savings account");
   }
   
   public void takeLoan(double amount) {
        System.out.println("Loan of amount " + amount + " taken");
    }

}
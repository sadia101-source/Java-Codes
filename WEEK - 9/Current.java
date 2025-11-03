package week_9;

public class Current extends Account3{
    double balance;
    
    Current(int id, String name, String address, double balance){
        super(id, name, address, balance);
        this.balance = balance;
    }
    
    @Override
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Current balance: " + balance);
        }else{
            System.out.println("Invalid entry.");
        }
    }
    
    @Override
    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Current balance: " + balance);
        }
    }
}

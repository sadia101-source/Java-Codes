package week_9;

public abstract class Account2 {
    int id;
    String holderName;
    String address;
    double balance;
    
    Account2(int id, String x, String y){
        this.id = id;
        this.holderName = x;
        this.address = y;
    }
    
    abstract void deposit(double amount);
    
    abstract void withdraw(double amount);
    
    
}

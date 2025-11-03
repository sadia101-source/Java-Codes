package week_9;

public abstract class Account3 {
    int id;
    String name;
    String address;
    double balance;
    
    Account3(int id, String x, String y, double balance){
        this.id = id;
        this.name = x;
        this.address = y;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    
    abstract void withdraw(double amount);
    
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

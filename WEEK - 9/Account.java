package week_9;

public class Account {
    String holderName;
    int ID;
    String address;
    double balance;
    
    Account(int id, String a, String address) {
        this.ID = id;
        this.holderName = a;
        this.address = address;
        this.balance = 0.0;
    }
    
    Account(String a) {
        this.holderName = a;
    }
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + ", your Deposited amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + ", your Withdrawn amount: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
    
    static double simpleInter(double p, double r, double t){
        return ((p*r*t)/100);
    }
    
    static double compInter (double p, double r, double t){
        return p*Math.pow((1 + r/100), t) - p;
    }
    
    void display(){
        System.out.println("Holder name: " + holderName);
        System.out.println("ID: " + ID);
        System.out.println("Currrent Balance: " + balance);
        System.out.println("Address: " + address);
    }
}
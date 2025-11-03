package week_9;


public class savings extends Account{
    double balance;
    double minBalance;

    savings(int id, String name, String address, double balance, double minBalance){
        super(id, name, address);
        this.balance = balance;
        this.minBalance = minBalance;
    }

    @Override
    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited in Saving Account. New balance: " + balance);
    }

    @Override
    void withdraw(double amount){
        if ((balance - amount) >= minBalance){
            balance -= amount;
            System.out.println(amount + " withdrawn from Saving Account. Remaining balance: " + balance);
        } else {
            System.out.println("Cannot withdraw! Minimum balance of " + minBalance + " must be maintained.");
        }
    }

    @Override
    void display(){
        super.display();
        System.out.println("Balance: " + balance);
        System.out.println("Min Balance: " + minBalance);
    }
}


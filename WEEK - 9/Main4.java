package week_9;

public class Main4 {
    public static void main(String[] args){
        
        class SavingAcc extends Account2{
            double balance;

            public SavingAcc(int id, String name, String address, double balance){
                super(id, name, address);
                this.balance = balance;
            }
            
            @Override
            void withdraw(double amount){
                System.out.println("Amount withdrawal request sent.");
                if (amount > 0 && amount <= balance){
                    balance -= amount;
                    System.out.println("$" + amount + " is withdrawn.");
                }else{
                    System.out.println("Invalid input or insufficient Balance.");
                }
            }
            
            @Override
            void deposit(double amount){
                if (amount > 0){
                    balance += amount;
                }else{
                    System.out.println("Try next time.");
                }
            }
            
            void display(){
                System.out.println("Account ID: " + id);
                System.out.println("Account Holder's Name: " + holderName);
                System.out.println("Address: " + address);
                System.out.println("Current Balance: $" + balance);
                System.out.println();
            }
        }
        
        SavingAcc s = new SavingAcc(7078, "Zainab", "House 203, London", 7340067);
        s.display();
        s.deposit(4300);
        s.display();
        s.withdraw(4300);
        s.display();
    }
}

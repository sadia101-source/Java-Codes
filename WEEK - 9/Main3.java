package week_9;

public class Main3 {
    public static void main(String[] args){
        Account account = new Account("Sara");
        Account acc2 = new Account(7844, "Rafiya", "313 Street, City xyz");
        
        account.deposit(35700);
        acc2.deposit(35000);
        account.withdraw(5000);
        
        account.display();
        System.out.println();
        acc2.display();
    }
}

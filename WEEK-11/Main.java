package week_11;

public class Main {

    public static void main(String[] args) {
        Account.aboutBank();
        Saving s = new Saving();
        s.deposit(3232.3);
        s.withdraw(312.23);
        s.takeLoan(50000);
        Current c = new Current();
        c.deposit(424234.333);
        c.withdraw(6592);
        c.takeLoan(383);
    }
}
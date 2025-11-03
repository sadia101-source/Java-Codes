package week_9;

public class Main5 {
    public static void main(String [] args){
        savings s = new savings(708, "Khadeeja", "House 401", 7098554, 700);
        Current c = new Current(779, "Rafiya", "House 203", 7098654);
        
        s.display();
        c.display();
        c.deposit(4500);
        System.out.println();
        c.withdraw(4500);
    }
}

package week_9;

public class Main {
    public static void main(String[] args){
        Bus bus = new Bus("Han Bus", "Butcher street 313");
        Train train = new Train("Wolf", "Etah");
        
        train.setCost(4.3);
        bus.setCost(2.5);
        
        train.display();
        train.cost();
        System.out.println();
        bus.display();
        bus.cost();
        
    }
}

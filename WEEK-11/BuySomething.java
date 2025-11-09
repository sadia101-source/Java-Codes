package week_11;

public class BuySomething implements Bike, Scooty{
    public void offer(){
        System.out.println("30% off");
    }
    
    public void details(){
        Bike.super.details();   
        Scooty.super.details();
    }
    
}

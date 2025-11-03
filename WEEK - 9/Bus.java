package week_9;

public class Bus extends Vehicle{
    String name;
    String street;
    Bus(String name, String street){
        this.name= name;
        this.street = street;
    }
    
    void display(){
        System.out.println("This is a Bus.");
    }
}

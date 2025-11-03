package week_9;

public class Vehicle {
    double ticketPrice;
    
    void setCost(double a){
        this.ticketPrice = a;
    }
    
    void cost(){
        System.out.println("The price of ticket is: $" + ticketPrice);
    }
}
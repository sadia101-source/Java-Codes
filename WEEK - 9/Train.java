package week_9;

public class Train extends Vehicle{
    String name;
    String city;
    
    Train(String a, String b){
        this.name = a;
        this.city = b;
    }
    void display(){
        System.out.println("This is a Train.");
    }
}

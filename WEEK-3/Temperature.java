package WEEK_3;

public class Temperature {
    public static void main(String [] args){
        double tc = 35;
        double tf = ((tc*(1.8))+ 32); //fahren. temp = cel. temp*9/5 + 32 or = cel. temp*1.8 + 32
        
        System.out.println("Temperature in Celcius: " + tc);
        System.out.println("Temperature in Fahrenheit: " + tf);
    }
}
